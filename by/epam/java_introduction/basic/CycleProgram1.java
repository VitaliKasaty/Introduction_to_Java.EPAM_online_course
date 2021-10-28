package by.epam.java_introduction.basic;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class CycleProgram1 {

    public static void main(String[] args) {

        int n;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);

    }
}
