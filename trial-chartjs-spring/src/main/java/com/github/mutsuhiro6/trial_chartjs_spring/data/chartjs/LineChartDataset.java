package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LineChartDataset extends Dataset<Double> {

  private Color backgroundColor;

  private String borderCapStyle;

  private Color borderColor;

  private List<Double> borderDash;

  private double borderDashOffset;

  private String borderJoinStyle;

  private double borderWidth;

  private Clip<?> clip;

  private String cubicInterpolationMode;

  private Fill<?> fill;

  private Color hoverBackgroundColor;

  private String hoverBorderCapStyle;

  private Color hoverBorderColor;

  private List<Double> hoverBorderDash;

  private double hoverBorderDashOffset;

  private String hoverBorderJoinStyle;

  private double hoverBorderWidth;

  private String indexAxis;

  private double order;

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

  // TODO: Support HTML canvas Image
  private PointStyle pointStyle;

  // TODO: Support segment
  private Segment segment;

  private boolean showLine;

  private SpanGaps<?> spanGaps;

  // TODO: Support stack
  private String stack;

  private Stepped<?> stepped;

  private double tension;

  private String xAxisID;

  private String yAxisID;

  public Object getClip() {
    if (this.clip == null) {
      return null;
    }
    return this.clip.getClip();
  }

  public Object getFill() {
    if (this.fill == null) {
      return null;
    }
    return this.fill.getFill();
  }

  public Object getSpanGaps() {
    if (this.spanGaps == null) {
      return null;
    }
    return this.spanGaps.getSpanGaps();
  }

  public Object getStepped() {
    if (this.stepped == null) {
      return null;
    }
    return stepped.getStepped();
  }

  public String getBackgroundColor() {
    if (this.backgroundColor == null) {
      return null;
    }
    return this.backgroundColor.getColor();
  }

  public String getBorderColor() {
    if (this.borderColor == null) {
      return null;
    }
    return this.borderColor.getColor();
  }

  public String getHoverBackgroundColor() {
    if (this.hoverBackgroundColor == null) {
      return null;
    }
    return this.hoverBackgroundColor.getColor();
  }

  public String getHoverBorderColor() {
    if (this.hoverBorderColor == null) {
      return null;
    }
    return this.hoverBorderColor.getColor();
  }

  public String getPointBackgroundColor() {
    if (this.pointBackgroundColor == null) {
      return null;
    }
    return this.pointBackgroundColor.getColor();
  }

  public String getPointBorderColor() {
    if (this.pointBorderColor == null) {
      return null;
    }
    return this.pointBorderColor.getColor();
  }

  public String getPointHoverBackgroundColor() {
    if (this.pointHoverBackgroundColor == null) {
      return null;
    }
    return pointHoverBackgroundColor.getColor();
  }

  public String getPointHoverBorderColor() {
    if (this.pointHoverBorderColor == null) {
      return null;
    }
    return this.pointHoverBorderColor.getColor();
  }

  public LineChartDataset(List<Double> data) {
    super(data);
  }

  public LineChartDataset(ChartTypes type, List<Double> data) {
    super(type, data);
  }

  public LineChartDataset(ChartTypes type, String label, List<Double> data) {
    super(type, label, data);
  }

  public LineChartDataset(String label, List<Double> data) {
    super(label, data);
  }
}
