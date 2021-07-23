package com.dsgimhana.version2;

public class Coffee extends Beverage {
  /**
   * Repeated
   */
  public void prepare(){
    System.out.println("*** Start Making Coffee ***");
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }

  private void brewCoffeeGrinds() {
    System.out.println("Dripping Coffee through filter");
  }

  private void addSugarAndMilk() {
    System.out.println("Adding Sugar and Milk");
  }
}
