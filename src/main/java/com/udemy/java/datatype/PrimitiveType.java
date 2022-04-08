package com.udemy.java.datatype;

public class PrimitiveType {
    public static void main(String[] args){
        int i=5;

        System.out.print("Before ::" + i);
        change(i);
        System.out.print("After ::" + i);
    }

    public static void change(int a){
        a++;
    }
}


