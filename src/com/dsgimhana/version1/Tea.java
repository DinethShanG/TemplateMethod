package com.dsgimhana.version1;

public class Tea {
  public void prepare(){
    System.out.println("*** Start Making Tea ***");
    boilWater();
    steepTeaBag();
    addLemon();
    pourInCup();
  }

  /**
   * repeated
   */
  private void boilWater() {
    System.out.println("Boiling Water");
  }

  private void steepTeaBag() {
    System.out.println("Steeping Tea Bag");
  }

  /**
   * repeated
   */
  private void pourInCup() {
    System.out.println("Pouring into Cup");
  }

  private void addLemon() {
    System.out.println("Adding Lemon");
  }
}
