package com.dsgimhana.version2;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n=========Version 02=========\n");
    /**
     * Making a Coffee
     */
    Coffee coffee = new Coffee();
    coffee.prepare();

    System.out.println("\n====================================\n");

    /**
     * Making a Tea
     */
    Tea tea = new Tea();
    tea.prepare();
  }
}
