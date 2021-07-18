package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BorderWidth<T> {

  private final T borderWidth;

  @Getter
  @AllArgsConstructor
  public static class BorderWidthProperty {

    private final double left;

    private final double top;

    private final double right;

    private final double bottom;

  }
}
