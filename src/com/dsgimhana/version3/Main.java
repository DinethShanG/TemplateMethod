package com.dsgimhana.version3;


public class Main {
  public static void main(String[] args) {
    System.out.println("\n=========Version 03=========\n");
    /**
     * Making a Coffee
     */
    Beverage coffee = new Coffee();
    coffee.prepare();

    System.out.println("\n====================================\n");

    /**
     * Making a Tea
     */
    Beverage tea = new Tea();
    tea.prepare();
  }
}
