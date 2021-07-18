package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

public class RGBA implements Color {

  private int red;
  private int green;
  private int blue;
  private double alpha;
  private String color;

  public RGBA(int red, int green, int blue, double alpha) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = alpha;
    this.color = String.format("rgba(%d, %d, %d, %f)", this.red, this.green, this.blue, this.alpha);
  }

  @Override
  public String getColor() {
    return this.color;
  }
}
