package com.udemy.java.primeandpalindroms;
import java.util.Scanner;
import java.util.ArrayList;
import com.udemy.java.primeandpalindroms.numbers;
import com.udemy.java.primeandpalindroms.NotPrimeNotPalindromeFibonacci;
import com.udemy.java.primeandpalindroms.NotPrimeNotPalindromeNotFibonacci;
import com.udemy.java.primeandpalindroms.NotPrimePalindromeNotFibonacci;
import com.udemy.java.primeandpalindroms.NotPrimePalindromeFibonacci;
import com.udemy.java.primeandpalindroms.PrimePalindromeFibonacci;
import com.udemy.java.primeandpalindroms.PrimePalindromeNotFibonacci;
import com.udemy.java.primeandpalindroms.primeNotPalindromeFibonacci;
import com.udemy.java.primeandpalindroms.primeNotPalindromeNotFibonacci;


public abstract class primePalindromesMain {

    public static void main(String[] args) {
        Scanner lScanner = new Scanner(System.in);
        System.out.println("Enter a number to get its type:");
        int num = lScanner.nextInt();

        if(!numbers.isPalindrome(num) && !numbers.isPrime(num) && !numbers.isFibonacci(num)){
            NotPrimeNotPalindromeNotFibonacci number = new NotPrimeNotPalindromeNotFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(!numbers.isPalindrome(num) && !numbers.isPrime(num) && numbers.isFibonacci(num)){
            NotPrimeNotPalindromeFibonacci number = new NotPrimeNotPalindromeFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(!numbers.isPalindrome(num) && numbers.isPrime(num) && numbers.isFibonacci(num)){
            primeNotPalindromeFibonacci number = new primeNotPalindromeFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(!numbers.isPalindrome(num) && numbers.isPrime(num) && !numbers.isFibonacci(num)){
            primeNotPalindromeNotFibonacci number = new primeNotPalindromeNotFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(numbers.isPalindrome(num) && numbers.isPrime(num) && !numbers.isFibonacci(num)){
            PrimePalindromeNotFibonacci number = new PrimePalindromeNotFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(numbers.isPalindrome(num) && !numbers.isPrime(num) && !numbers.isFibonacci(num)){
            NotPrimePalindromeNotFibonacci number = new NotPrimePalindromeNotFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(numbers.isPalindrome(num) && numbers.isPrime(num) && numbers.isFibonacci(num)){
            PrimePalindromeFibonacci number = new PrimePalindromeFibonacci();
            number.numName = num;
            number.resUlt();
        }
        else if(numbers.isPalindrome(num) && !numbers.isPrime(num) && numbers.isFibonacci(num)){
            NotPrimePalindromeFibonacci number = new NotPrimePalindromeFibonacci();
            number.numName = num;
            number.resUlt();
        };
        lScanner.close();
    }
}
