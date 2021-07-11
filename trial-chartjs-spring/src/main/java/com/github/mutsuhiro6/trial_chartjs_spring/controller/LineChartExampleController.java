package com.github.mutsuhiro6.trial_chartjs_spring.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.ChartConfig;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.ChartTypes;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Data;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Fill;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.LineChartDataset;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.RGB;


@Controller
public class LineChartExampleController {

  @GetMapping("/line")
  public String lineChartExample(Model model)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException,
      JsonProcessingException {
    List<String> labels =
        new ArrayList<>(Arrays.asList("Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun", "Jul."));
    List<Double> points = new ArrayList<>(Arrays.asList(65.0, 59.0, 80.0, 81.0, 56.0, 55.0, 40.0));
    LineChartDataset dataset = new LineChartDataset("My first dataset", points);
    dataset.setFill(new Fill<>(false));
    dataset.setBorderColor(new RGB(75, 192, 192));
    // dataset.setTension(0.1);
    List<LineChartDataset> datasets = new ArrayList<>(Arrays.asList(dataset));
    Data data = new Data(labels, datasets);
    ChartConfig config = new ChartConfig(ChartTypes.line, data);
    ObjectMapper mapper = new ObjectMapper();
    @SuppressWarnings("unchecked")
    Map<String, Object> configMap = mapper.convertValue(config, Map.class);
    model.addAttribute("config", configMap);
    return "doughnut";
  }

}
