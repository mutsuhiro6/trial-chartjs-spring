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
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Color;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Data;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.DoughnutAndPieChartDataset;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.RGB;


@Controller
public class PieChartExampleController {

  @GetMapping("/pie")
  public String pieChartExample(Model model)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException,
      JsonProcessingException {
    List<String> labels = new ArrayList<>(Arrays.asList("Red", "Blue", "Yellow"));
    List<Color> backgroundColor = new ArrayList<>(Arrays.asList(
        new RGB(255, 99, 132),
        new RGB(54, 162, 235),
        new RGB(255, 205, 86)));
    DoughnutAndPieChartDataset dd = new DoughnutAndPieChartDataset("My first dataset",
        new ArrayList<Double>(Arrays.asList(300.0, 50.0, 100.0)), backgroundColor);
    dd.setHoverOffset(8);
    List<DoughnutAndPieChartDataset> datasets = new ArrayList<>(Arrays.asList(dd));
    Data data = new Data(labels, datasets);
    ChartConfig config = new ChartConfig(ChartTypes.pie, data);
    ObjectMapper mapper = new ObjectMapper();
    @SuppressWarnings("unchecked")
    Map<String, Object> configMap = mapper.convertValue(config, Map.class);
    model.addAttribute("config", configMap);
    return "doughnut";
  }
}
