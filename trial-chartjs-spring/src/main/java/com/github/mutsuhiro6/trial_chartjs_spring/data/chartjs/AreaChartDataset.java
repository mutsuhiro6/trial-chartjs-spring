package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class AreaChartDataset extends Dataset<AreaData> {

  public AreaChartDataset(String label, List<AreaData> data) {
    super(label, data);
  }

}
