package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChartConfig {

  private ChartTypes type;

  private Data data;

  private Options options;

  private ObjectMapper mapper;

  public ChartConfig(ChartTypes type, Data data) {
    this.type = type;
    this.data = data;
  }

  @SuppressWarnings("unchecked")
  public Map<String, Object> getConfigMap() {
    mapper = new ObjectMapper();
    return mapper.convertValue(this, HashMap.class);
  }
}
