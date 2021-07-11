package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Data {

  private List<String> labels;

  private List<Dataset> datasets;

  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public List<Dataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<Dataset> datasets) {
    this.datasets = datasets;
  }
}
