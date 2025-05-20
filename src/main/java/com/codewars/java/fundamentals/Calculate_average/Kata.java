package com.codewars.java.fundamentals.Calculate_average;

/*
 * Write a function which calculates the average of the numbers in a given array.
 *
 * Note: Empty arrays should return 0.
 */

import java.util.Arrays;

public class Kata {
    public static double findAverage(int[] array) {
        //se inicializa la suma en 0
        int sum = 0;

        //se realiza for para realizar recorrido y sumar los valores
        for (int i = 0; i < array.length; i++ ){
            sum += array[i];
        }

        //se realiza clausula de guarda para validar si el array esta vacio
        if (array.length == 0){
            return 0.0;
        }

        //se retorna el promedio del array y se castea double ya que puede haber decimales
        return (double) sum / array.length;
    }
}
