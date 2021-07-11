package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import java.util.stream.Collectors;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class DoughnutDataset extends Dataset {

  private List<Color> backgroundColor = null;

  private Integer hoverOffset = null;

  public DoughnutDataset(String label, List<Double> data, List<Color> backgroundColor,
      Integer hoverOffset) {
    super(label, data);
    this.backgroundColor = backgroundColor;
    this.hoverOffset = hoverOffset;
  }

  public List<String> getBackgroundColor() {
    return this.backgroundColor
        .stream()
        .map(color -> color.getColor())
        .collect(Collectors.toList());
  }

  public int getHoverOffset() {
    return this.hoverOffset;
  }
}
