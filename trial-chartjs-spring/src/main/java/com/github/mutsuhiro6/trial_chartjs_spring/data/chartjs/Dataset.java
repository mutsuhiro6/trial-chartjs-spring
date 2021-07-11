package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Dataset<T> {

  private ChartTypes type;

  private String label;

  private List<T> data = new ArrayList<>();

  public Dataset(String label, List<T> data) {
    this(data);
    this.label = label;
  }

  public Dataset(List<T> data) {
    this.data = data;
  }

  public Dataset(ChartTypes type, String label, List<T> data) {
    this(label, data);
    this.type = type;
  }

  public Dataset(ChartTypes type, List<T> data) {
    this(data);
    this.type = type;
  }

}
