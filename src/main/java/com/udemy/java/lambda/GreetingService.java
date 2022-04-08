package com.udemy.java.lambda;
//SAM single abstract method

//@functionalInterface i guess its not required anymore
public interface GreetingService {
    //void greet(String FirstName, String Lastname, int age);
    //to return a parameter look down:
    String greet(String FirstName);
}
