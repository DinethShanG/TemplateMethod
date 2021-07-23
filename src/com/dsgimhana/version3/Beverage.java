package com.dsgimhana.version3;

public abstract class Beverage {

  /**
   * Template Methods
   */

  public final void prepare(){
    System.out.println("*** Start Making Coffee ***");
    boilWater(); // concrete methods
    brewBeverage(); // premitive opration
    pourInCup(); // concrete methods
    addCondiments(); // premitive opration
  }

  /**
   * Non-Abstract Methods
   */

  private void boilWater() {
    System.out.println("Boiling Water");
  }

  private void pourInCup() {
    System.out.println("Pouring into Cup");
  }


  /**
   * Abstract Methods
   */

  public abstract void brewBeverage();

  public abstract void addCondiments();
}

// hollywood principle
// don't call us , If you hav ability we'll call you

