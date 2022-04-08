package com.udemy.java.primeandpalindroms;

import java.util.ArrayList;

public abstract class numbers {

    protected int numName;

    public abstract void resUlt();

    public static boolean isPalindrome(int num){
        String numElements = Integer.toString(num);
        if(num == 0 || num == 1 ){
            return false;
        };
        for(int i = 0; i < numElements.length(); i++) {
            char first = numElements.charAt(i);
            char last = numElements.charAt(numElements.length()-1-i);
            if(first != last){
                return false;
            };
        };
        return true;
    }

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1 ){
            return false;
        };
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            };
        };
        return true;
    }

    public static boolean isFibonacci(int n){
        ArrayList<Integer> fib = new ArrayList<Integer>();

        if (n <= 0){
            fib.add(0);
        };
        if (n == 1){
            fib.add(0);
            fib.add(1);
        };
        if (n >= 2){
            fib.add(0);
            fib.add(1);
            for (int i= 2; i< n+1; i++){
                int fib_i = 0;
                fib_i = fib.get(i-1)+ fib.get(i-2);
                fib.add(fib_i);
            };
        };

        for(int j= 0; j <n; j++){
            if(n == fib.get(j)){
                return true;
            };
        };
        return false;
    }
}
