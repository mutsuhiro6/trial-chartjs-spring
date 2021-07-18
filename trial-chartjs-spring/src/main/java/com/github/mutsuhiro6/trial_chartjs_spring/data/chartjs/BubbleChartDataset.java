package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BubbleChartDataset extends Dataset<BubbleData> {

  private Color backgroundColor;

  private Color borderColor;

  private double borderWidth;

  private Clip<?> clip;

  private Color hoverBackgroundColor;

  private Color hoverBorderColor;

  private double hoverBorderWidth;

  private double hoverRadius;

  private double hitRadius;

  private double order;

  private PointStyle pointStyle;

  private double rotation;

  private double radius;

  public BubbleChartDataset(String label, List<BubbleData> data) {
    super(label, data);
  }

}
