package com.nikita.homework2;

import java.util.function.DoubleToIntFunction;

/**
 * 1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

public class Task1 {

    public static void main(String[] args) {
        int value = 123;
        int result = sum(value);
        System.out.println(result);
    }

    public static int sum(int value) {
        int result = 0;
        int anotherValue = value;
        while (anotherValue !=0) {
           result += anotherValue % 10;
           anotherValue /= 10;
        }
        return result;




    }

}
