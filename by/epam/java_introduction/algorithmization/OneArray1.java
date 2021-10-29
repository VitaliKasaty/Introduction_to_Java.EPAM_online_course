package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class OneArray1 {

    public static void main(String[] args) {

        int[] a;
        int n;
        int k;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        n = in.nextInt();
        System.out.print("Введите число K: ");
        k = in.nextInt();
        a = new int[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100) + 1;
            System.out.print("[" + a[i] + "] ");
        }

        System.out.println("\nЭлементы массива кратные K: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0)  System.out.print("[" + a[i] + "] ");
        }

    }
}
