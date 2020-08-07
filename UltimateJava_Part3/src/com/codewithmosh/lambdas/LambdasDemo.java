package com.codewithmosh.lambdas;

public class LambdasDemo {
  // instance field
  public String prefix = "-";

  public LambdasDemo() {
  }

  public LambdasDemo(String string) {
  }

  public static void printer1(String string) {
  }

  public void printer2(String string) {
  }

  public static void show() {
    // anonymous inner class
    greet(new Printer() {
      @Override
      public void print(String message) {
        System.out.println(message);
        System.out.println(this.getClass());
      }
    });

    // lambda expression
    greet(message -> System.out.println(message));
    Printer printer = message -> System.out.println(message);

    // method reference
    greet(System.out::println);
    greet(LambdasDemo::printer1);// class method reference
    greet(new LambdasDemo()::printer2);// instance method reference
    greet(LambdasDemo::new);// constructor method reference

  }

  public void showAnother() {
    // variable capture
    greet(message -> System.out.println(message + this.getClass()));
  }

  // code against interface
  public static void greet(Printer printer) {
    printer.print("Hello World");
  }

  public static void main(String[] args) {
    show();
    new LambdasDemo().showAnother();
  }
}
