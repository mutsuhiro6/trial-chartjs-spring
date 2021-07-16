package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PolarAreaChartDataset extends Dataset<Double> {

  private Color backgroundColor;

  private BorderAlign borderAlign;

  private Color borderColor;

  private double borderWidth;

  private Clip<?> clip;

  private Color hoverBackgroundColor;

  private Color hoverBorderColor;

  private double hoverBorderWidth;

  public PolarAreaChartDataset(String label, List<Double> data) {
    super(label, data);
  }
}
