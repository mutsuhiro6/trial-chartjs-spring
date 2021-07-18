package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Stepped<T> {
  private final T stepped;
}
