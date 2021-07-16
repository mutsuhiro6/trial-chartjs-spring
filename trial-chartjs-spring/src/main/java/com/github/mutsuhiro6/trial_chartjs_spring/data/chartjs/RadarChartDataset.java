package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RadarChartDataset extends Dataset<Double> {

  private Color backgroundColor;

  private String borderCapStyle;

  private Color borderColor;

  private List<Double> borderDash;

  private double borderDashOffset;

  private String borderJoinStyle;

  private double borderWidth;

  private Color hoverBackgroundColor;

  private String hoverBorderCapStyle;

  private Color hoverBorderColor;

  private List<Double> hoverBorderDash;

  private double hoverBorderDashOffset;

  private String hoverBorderJoinStyle;

  private double hoverBorderWidth;

  private Clip<?> clip;

  private Fill<?> fill;

  private double order;

  private double tension;

  private Color pointBackgroundColor;

  private Color pointBorderColor;

  private double pointBorderWidth;

  private double pointHitRadius;

  private Color pointHoverBackgroundColor;

  private Color pointHoverBorderColor;

  private double pointHoverBorderWidth;

  private double pointHoverRadius;

  private double pointRadius;

  private double pointRotation;

  private PointStyle pointStyle;

  private boolean spanGaps;

  public RadarChartDataset(String label, List<Double> data) {
    super(label, data);
  }

}
