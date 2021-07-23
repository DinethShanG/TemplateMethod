package com.dsgimhana.version2;

public class Tea extends Beverage{
  /**
   * Repeated
   */
  public void prepare(){
    System.out.println("*** Start Making Tea ***");
    boilWater();
    steepTeaBag();
    addLemon();
    pourInCup();
  }

  private void steepTeaBag() {
    System.out.println("Steeping Tea Bag");
  }

  private void addLemon() {
    System.out.println("Adding Lemon");
  }
}
