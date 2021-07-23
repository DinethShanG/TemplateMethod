package com.dsgimhana.version1;

public class Coffee {

  public void prepare(){
    System.out.println("*** Start Making Coffee ***");
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }

  /**
   * repeated
   */
  private void boilWater() {
    System.out.println("Boiling Water");
  }

  private void brewCoffeeGrinds() {
    System.out.println("Dripping Coffee through filter");
  }

  /**
   * repeated
   */
  private void pourInCup() {
    System.out.println("Pouring into Cup");
  }

  private void addSugarAndMilk() {
    System.out.println("Adding Sugar and Milk");
  }

}
