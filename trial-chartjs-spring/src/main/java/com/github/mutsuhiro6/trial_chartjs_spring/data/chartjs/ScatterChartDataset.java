package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ScatterChartDataset extends Dataset<ScatterData> {

  private List<Color> backgroundColor;

  public ScatterChartDataset(String label, List<ScatterData> data) {
    super(label, data);
  }
}
