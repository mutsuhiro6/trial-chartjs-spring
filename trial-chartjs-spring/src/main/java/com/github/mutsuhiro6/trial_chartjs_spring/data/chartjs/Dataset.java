package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.Data;

@Data
public class Dataset<T> {

  private ChartTypes type;

  private String label;

  private List<T> data;

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
