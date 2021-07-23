package com.dsgimhana.version3;

public class Tea extends Beverage {

  @Override
  public void brewBeverage() {
    System.out.println("Steeping Tea Bag");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}
