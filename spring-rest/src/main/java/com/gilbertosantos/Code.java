/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gilbertosantos;

public class Code {
  public static void main(final String[] args) {
    final Parent p = new Parent();
    final Parent c = new Child();
    System.out.println("****************Method Hiding*******************");
    p.foo(); // This will call method in parent class
    c.foo(); // This will call method in parent class
    System.out.println("****************Method overriding*******************");
    p.bar(); // This will call method in parent class
    c.bar(); // This will call method in child class

  }
}