package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Options {

  private String indexAxis;

  private Scales scales;

  @Data
  public static class Scales {

    private Scale x;

    private Scale y;

    @Data
    public static class Scale {
      private Stacked<?> stacked;
      private boolean beginAtZero;

      public Object getStacked() {
        return this.stacked.getStacked();
      }

      @Data
      public static class Stacked<T> {
        private T stacked;
      }

    }
  }
}
