package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BorderRadius<T> {
  private T borderRadius;

  public static enum BorderRadiusProperty {
    outerStart, outerEnd, innerStart, innerEnd,;
  }
}
