package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

public class RGB implements Color {

  private int red;
  private int green;
  private int blue;
  private String color;

  public RGB(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.color = String.format("rgb(%d, %d, %d)", this.red, this.green, this.blue);
  }

  @Override
  public String getColor() {
    return this.color;
  }
}
