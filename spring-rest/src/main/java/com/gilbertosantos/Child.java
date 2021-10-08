package com.gilbertosantos;

public class Child extends Parent {

  // Hiding
  public static void foo() {
    System.out.println("Inside foo method in child class");
  }

  // Overriding
  @Override
  public void bar() {
    System.out.println("Inside bar method in child class");
  }
}
