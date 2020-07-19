package com.nikita.homework2;

import java.util.Scanner;

/**
 * 2. Написать программу, вычисляющую и отображающую все числа Фибоначчи
 * меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите целое число: ");
        int value = scanner.nextInt();
        fib(value);
    }

    public static void fib(int value){
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println(n0+" "+n1+" ");
        for (int i = 3; i < value; i++) {
        n2 = n0 +n1;
        System.out.println(n2+"");
        n0 = n1;
        n1 = n2;
        }
        System.out.println();



    }








}
