package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BorderWidth<T> {

  private T borderWidth;

  @Data
  @AllArgsConstructor
  public static class BorderWidthProperty {

    private double left;

    private double top;

    private double right;

    private double bottom;

  }
}
