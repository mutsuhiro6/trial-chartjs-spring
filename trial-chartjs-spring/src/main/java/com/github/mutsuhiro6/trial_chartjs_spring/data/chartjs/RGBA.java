package com.github.mutsuhiro6.trial_chartjs_spring.data.chartjs;

public class RGBA implements Color {

  private double red;
  private double green;
  private double blue;
  private double alpha;
  private String color;

  public RGBA(double red, double green, double blue, double alpha) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = alpha;
    this.color = String.format("rgba(%f, %f, %f, %f)", this.red, this.green, this.blue, this.alpha);
  }

  @Override
  public String getColor() {
    // TODO 自動生成されたメソッド・スタブ
    return this.color;
  }
}
