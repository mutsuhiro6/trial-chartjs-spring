package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ChartConfig {

  private ChartTypes type;

  private Data data;

  private Options options;

  public ChartConfig(ChartTypes type, Data data) {
    this.type = type;
    this.data = data;
  }
}
