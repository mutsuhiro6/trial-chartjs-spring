package com.github.mutsuhiro6.trial_chartjs_spring.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.ChartConfig;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.ChartTypes;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Color;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Data;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.Dataset;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.DoughnutDataset;
import com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs.RGB;


@Controller
public class DoughnutChartExampleController {

  @GetMapping("/doughnutClass")
  public String doughnutChartWithClassExample(Model model)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    List<String> labels = new ArrayList<>(Arrays.asList("Red", "Blue", "Yellow"));
    List<Color> backgroundColor = new ArrayList<>(Arrays.asList(
        new RGB(255, 99, 132),
        new RGB(54, 162, 235),
        new RGB(255, 205, 86)));
    DoughnutDataset dd = new DoughnutDataset("My first dataset",
        new ArrayList<Double>(Arrays.asList(300.0, 50.0, 100.0)), backgroundColor, 1);
    List<Dataset> datasets = new ArrayList<>(Arrays.asList(dd));
    Data data = new Data(labels, datasets);
    ChartConfig config = new ChartConfig(ChartTypes.DOUGHNUT, data);
    model.addAttribute("config", config);
    return "doughnut";
  }

  @SuppressWarnings("serial")
  @GetMapping("/doughnut")
  public String doughnutChartExample(Model model) {

    Map<String, Object> configMap = new HashMap<>() {
      {
        put("data", new HashMap<String, Object>() {
          {
            put("labels", new ArrayList<>(Arrays.asList("Red", "Blue", "Yellow")));
            put("datasets", new ArrayList<>(Arrays.asList(new HashMap<String, Object>() {
              {
                put("label", "My first dataset");
                put("data", new ArrayList<Double>(Arrays.asList(300.0, 50.0, 100.0)));
                put("backgroundColor", new ArrayList<Color>(Arrays.asList(
                    new RGB(255, 99, 132),
                    new RGB(54, 162, 235),
                    new RGB(255, 205, 86)))
                        .stream()
                        .map(rgb -> rgb.getColor())
                        .collect(Collectors.toList()));
                put("hoverOffset", 8);
                put("borderWidth", 0);
              }
            })));
          }
        });
        put("type", "doughnut");
      }
    };
    model.addAttribute("config", configMap);
    return "doughnut";
  }

  @SuppressWarnings("serial")
  @GetMapping("/doughnutJackson")
  public String doughnutChartWithJacksonExample(Model model)
      throws JsonProcessingException {
    String configStr = "{\"type\": \"doughnut\","
        + "\"data\":"
        + "{"
        + " \"labels\": ["
        + "    \"Red\","
        + "    \"Blue\","
        + "    \"Yellow\""
        + "  ],"
        + "  \"datasets\": [{"
        + "    \"label\": \"My First Dataset\","
        + "    \"data\": [300, 50, 100],"
        + "    \"backgroundColor\": ["
        + "      \"rgb(255, 99, 132)\","
        + "      \"rgb(54, 162, 235)\","
        + "      \"rgb(255, 205, 86)\""
        + "    ],"
        + "    \"hoverOffset\": 4"
        + "  }]"
        + "}}";

    @SuppressWarnings("unchecked")
    Map<String, Object> configMap = new ObjectMapper()
        .readValue(configStr, HashMap.class);
    model.addAttribute("config", configMap);
    return "doughnut";
  }
}
