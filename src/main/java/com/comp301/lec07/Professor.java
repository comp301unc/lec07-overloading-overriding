package com.comp301.lec07;

public class Professor extends Person {
  private int status;

  public Professor(String name) {
    this(name, 0); // Chain this constructor to the overloaded version

    // Old, non-chained constructor code below (commented out)
    // super(name);
    // status = 0;
  }

  // Overload the constructor
  public Professor(String name, int status) {
    super(name);
    this.status = status;
  }

  public void promote() {
    if (status == 2) {
      throw new RuntimeException("Can't promote");
    }
    status++; // Adds 1 to the value of status
  }

  // Overload the promote() method
  public void promote(int status) {
    if (status < 0 || status > 2) {
      throw new IllegalArgumentException("Invalid status");
    }
    this.status = status;
  }

  public String getStatus() {
    if (status == 0) {
      return "Assistant";
    } else if (status == 1) {
      return "Associate";
    } else {
      return "Full";
    }
  }

  // Override the getName() method from the Person superclass
  // Mark getName() "final" so subclasses of Professor can't override it
  @Override
  public final String getName() {
    // return "Professor " + name; // Works if "name" is protected in the Person class
    return "Professor " + super.getName();
  }
}
