package com.udemy.java;

import com.udemy.java.interfacepolymorphism.Alarm;
import com.udemy.java.interfacepolymorphism.Clock;
import com.udemy.java.interfacepolymorphism.GoogleMini;
import com.udemy.java.interfacepolymorphism.IPhone;
import com.udemy.java.lambda.GreetingService;
import com.udemy.java.lambda.StringOperations;
import com.udemy.java.polymorphism.Animal;
import com.udemy.java.polymorphism.Cat;
import com.udemy.java.polymorphism.Dog;
import com.udemy.java.polymorphism.Horse;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class TestMain {

    public static void main(String[] args) {
        //how to split into responsibilities with lambdas ( it didnt work, so we will do the lambdas as usual, more code, more security):
        //String ss;
        //ss = getLambda().greet( "data");
        //System.out.println(ss);
        //behavior of lambdas. The order of execution is: starting execution(first order) -> inside test method. Received lambda (execution of test with a lambda as a parameter)
        // -> which test effectively returns to the method, aggregate uppercase NISUM MY LOVe -> ending execution. the lambda does not execute inmediatedly
        //its parameters, first, it takes them as parameters by their values  and then executes what inside the lambda is.
        // takes the s value of test, descends to test, executes test, keeps s, the comeback to lamba to execute, the printing first and as second, the return. then, takes the last order.
        //System.out.println("Starting execution");
        //test(s -> {
            //System.out.println("inside lambda");
            //return s.toUpperCase();
        //});
        //System.out.println("Ending execution");

        //GreetingService g1 = (n) -> n.toUpperCase();
        //a method can receive another function as parameter.
        //test((n) -> n.toUpperCase() + n.toLowerCase() + n.length());
        //furthermore, you can call the same method with another function inside
        //test(a -> a.substring(0,3));
        //List<String> list = new ArrayList<>();
        //list.add("");
        //list.add("jhjh");
        // to quickly test
        //int a= 5;
        //Dog d = new Dog();
        //GreetingService hi = (FirstName, Lastname, age) -> System.out.println("My name is :: ")
        //take account of the shortcut which suggests to replace your expression by lambda.
        //List list = new List();
        //GreetingService hiService= (String name) -> System.out.println("Hi " + name + "!");

        //with a lambda I can erase the reference to the interface method
        // which contains its name (in this case, @override empty void method greet),
        // as well as the unnecessary explicit declaration of a new object.
        //note that the only one method which receives a String name parameter is void, so it´s taken by
        //this parameter, in case we have more than just one method inside greet (which is not allowed)
        // its basically the body of the method.
        //GreetingService helloService= (fn, ln, age) -> {
            //System.out.println("My name is :: " + fn +  " " +ln );
            //System.out.println("and my age is " + age);
        //};
        //GreetingService helloWithReturnService = (name) -> {
            //return name.toUpperCase();
        //};
        //GreetingService helloWithReturnService = (name) -> {
            //return name.toUpperCase() + list.get(1);
        //};
        //GreetingService helloWithTwopartsReturnService = (name) -> {
            //list.remove(1);
            //return name.toUpperCase() + list.get(1);
        //};
        //System.out.println(helloWithReturnService.greet("Juan"));
        //hiService.greet("Juan");
        //helloService.greet("Juan", "Gonzalez", 25 );
        //* to take account

        //METHOD REFERENCES
        //what a method reference is: we pass a value inside a single line lambda. in this case, with a static method system.out
        //
        StringOperations op1= (s) -> System.out.println(s);

        op1.accept("s: udemy");
    }
    // we remove this method for seccion Method references
    //private static void test(GreetingService g){
       //g.greet("Nisum my love");
       //System.out.println("inside test method. Received greeting");
    //}

    //private static void GreetingService getLambda(){
        //GreetingService g = (s) -> s.toUpperCase();
        //return (s) -> s.toUpperCase();
    //}

}