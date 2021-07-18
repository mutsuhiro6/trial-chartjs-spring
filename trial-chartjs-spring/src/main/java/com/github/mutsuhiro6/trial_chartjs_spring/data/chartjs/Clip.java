package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Clip<T> {
  private final T clip;

  @Data
  public static class ClipProperty {
    private int left;
    private int top;
    private int right;
    private int bottom;

    public ClipProperty(int left, int top, int right, int bottom) {
      this.left = left;
      this.top = top;
      this.right = right;
      this.bottom = bottom;
    }
  }
}
