package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Fill<T> {
  public T fill;

  public static enum Boundary {
    start, end, origin,;
  }

  public static enum StackedValueBelow {
    stack,;
  }

  @Data
  public static class AxisValue {
    private double value;
  }
}
