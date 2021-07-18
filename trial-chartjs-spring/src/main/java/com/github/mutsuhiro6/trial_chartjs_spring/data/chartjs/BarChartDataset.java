package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BarChartDataset extends Dataset<Double> {

  private Color backgroundColor;

  private double base;

  private double barPercentage;

  private BarTickness<?> barThickness;

  private Color borderColor;

  private String borderSkipped;

  private BorderWidth<?> borderWidth;

  private BorderRadius<?> borderRadius;

  private double categoryPercentage;

  private Clip<?> clip;

  private boolean grouped;

  private Color hoverBackgroundColor;

  private Color hoverBorderColor;

  private double hoverBorderWidth;

  private double hoverBorderRadius;

  private String indexAxis;

  private double maxBarThickness;

  private double minBarLength;

  private double order;

  private PointStyle pointStyle;

  private boolean skipNull;

  private String stack;

  private String xAxisID;

  private String yAxisID;

  public BarChartDataset(String label, List<Double> data) {
    super(label, data);
  }
}
