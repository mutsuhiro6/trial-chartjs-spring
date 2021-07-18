package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DoughnutAndPieChartDataset extends Dataset<Double> {

  private List<Color> backgroundColor;

  private BorderAlign borderAlign;

  private List<Color> borderColor;

  private BorderRadius<?> borderRadius;

  private List<Double> borderWidth;

  private double circumference;

  private Clip<?> clip;

  private List<Color> hoverBackgroundColor;

  private List<Color> hoverBorderColor;

  private List<Double> hoverBorderWidth;

  private double hoverOffset;

  private double offset;

  private double rotation;

  private double spacing;

  private int weight = 1;

  public DoughnutAndPieChartDataset(String label, List<Double> data) {
    super(label, data);
  }

  public List<String> getBackgroundColor() {
    if (this.backgroundColor == null) {
      return null;
    }
    return this.backgroundColor
        .stream()
        .map(color -> color.getColor())
        .collect(Collectors.toList());
  }

  public List<String> getBorderColor() {
    if (this.borderColor == null) {
      return null;
    }
    return this.borderColor
        .stream()
        .map(color -> color.getColor())
        .collect(Collectors.toList());
  }

  public List<String> getHoverBackgroundColor() {
    if (this.hoverBackgroundColor == null) {
      return null;
    }
    return this.hoverBackgroundColor
        .stream()
        .map(color -> color.getColor())
        .collect(Collectors.toList());
  }

  public List<String> getHoverBorderColor() {
    if (this.hoverBorderColor == null) {
      return null;
    }
    return this.hoverBorderColor
        .stream()
        .map(color -> color.getColor())
        .collect(Collectors.toList());
  }

  public Object getBorderRadius() {
    if (this.borderRadius == null) {
      return null;
    }
    return this.borderRadius.getBorderRadius();
  }

  public Object getClip() {
    if (this.clip == null) {
      return null;
    }
    return this.clip.getClip();
  }
}
