package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

public class ChartConfig {

  private String type = null;

  private Data data = null;

  public ChartConfig(ChartTypes type, Data data) {
    this.type = type.getType();
    this.data = data;
  }

  public String getType() {
    return type;
  }

  public Data getData() {
    return data;
  }
}
