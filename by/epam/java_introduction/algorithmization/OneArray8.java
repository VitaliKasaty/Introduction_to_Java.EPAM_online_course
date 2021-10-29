package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дана последовательность целых чисел. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min

public class OneArray8 {

    public static void main(String[] args) {

        int a[];
        int n;
        int min = Integer.MAX_VALUE;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new int[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i] < min) {
                min = a[i];
            }
            System.out.print("[" + a[i] + "] ");
        }

        System.out.println("\nРезультат: ");
        for (int i = 0; i < n; i++) {
            if (a[i] > min) {
                System.out.print("[" + a[i] + "] ");
            }
        }

    }
}
