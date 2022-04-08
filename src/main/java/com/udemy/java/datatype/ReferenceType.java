package com.udemy.java.datatype;
import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args){
        //abc123
        int[] arr= new int[] {1,2,3};


        predict(arr);

        totalSale(arr);
    }

    //abc123
    private static void predict(int[] a){
        //def23
        a = Arrays.copyOf(a, a.length);
        //to prevent mutation what we do is to make a new array with the elements of the original. if
        //we dont, the thing we do is to mutate the original, which is something we should want to avoid, specially
        //when we have one hundred different methods around, because it can drive us to unexpected (mutated) results.
        a[0]++;
        a[1]++;
        System.out.println("Prediction for next month :: " + (a[0] + a[1] + a[2]));
    }

    //abc123
    private static void totalSale(int[] a){

        //abc123
        System.out.println("Total Sale for this month :: " + (a[0] + a[1] + a[2]));

    }

}
//a change(arr) se le pasa el nuevo arreglo a que se declara en change, entonces no hace ningun cambio. pero si borramos el arreglo, a, lo
//que pasa con los objetos complejos es que solo usan una referencia (abc123) y son construidos, por asi decirlo, al momento de usarlos
//de manera que el metodo change, si afecta al arreglo original, a diferencia de lo que pasa en los primitivos, que no retornan desde el metodo al main.