package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /*
  * @param someone person to greet
  * @return String person greetings
  */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
