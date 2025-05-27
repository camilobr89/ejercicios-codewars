package com.codewars.java.fundamentals.Square_n_Sum;

/*
*
* Complete the square sum function so that it squares
* each number passed into it and then sums the results together.
*
* */

import java.util.Arrays;

public class Kata
{


    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(x -> x * x ).sum();
    }
}