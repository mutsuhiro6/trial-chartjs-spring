package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Data {

  private List<String> labels;

  private List<? extends Dataset<?>> datasets = new ArrayList<>();

  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public List<?> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<? extends Dataset<?>> datasets) {
    this.datasets = datasets;
  }
}
