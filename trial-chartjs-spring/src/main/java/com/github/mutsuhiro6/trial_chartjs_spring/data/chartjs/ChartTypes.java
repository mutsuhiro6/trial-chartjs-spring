package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

public enum ChartTypes {

  DOUGHNUT("doughnut"),;

  private String type;

  private ChartTypes(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}
