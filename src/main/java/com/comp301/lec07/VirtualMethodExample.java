package com.comp301.lec07;

class Pet {
  public String noise() {
    return "ahhh";
  }
}

class Dog extends Pet {
  @Override
  public String noise() {
    return "woof";
  }
}

public class VirtualMethodExample {
  public static void main(String[] args) {
    Pet fidoAsPet = new Dog();
    Dog fidoAsDog = (Dog) fidoAsPet;
    System.out.println(fidoAsPet.noise()); // prints "woof" if noise() is virtual, "ahhh" if not
    System.out.println(fidoAsDog.noise()); // always prints "woof"
  }
}
