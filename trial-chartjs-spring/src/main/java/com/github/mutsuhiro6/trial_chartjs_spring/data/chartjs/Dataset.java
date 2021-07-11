package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dataset {

  private String label = null;

  private List<Double> data = null;

}
