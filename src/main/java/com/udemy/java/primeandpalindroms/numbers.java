package com.udemy.java.primeandpalindroms;

import java.util.ArrayList;

public abstract class numbers {

    protected int numName;

    public abstract void resUlt();

    public static boolean isPalindrome(int num){
        String numElements = Integer.toString(num);
        if(numElements.length() == 1){
            return false;
        } else {
            for(int i = 0; i < numElements.length(); i++) {
                char first = numElements.charAt(i);
                char last = numElements.charAt(numElements.length()-1-i);
                if(first != last){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1 ){
            return false;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFibonacci(int n){
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        fib.add(1);

        if (n < 0){
            return false;
        }
        if (n == 0 || n==1 || n== 2 || n==3){
            return true;
        }
        else {
            for (int i= 3; i < n+1; i++){
                int fib_i = fib.get(i-1)+ fib.get(i-2);
                fib.add(fib_i);
            }
        }

        for(int j= 0; j <n+1; j++){
            if(n == fib.get(j)){
                return true;
            }
        }
        return false;
    }
}
