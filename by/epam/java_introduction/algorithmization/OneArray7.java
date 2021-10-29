package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Даны действительные числа. Найти max ряда

public class OneArray7 {

    public static void main(String[] args) {

        double a[];
        int n;
        double result;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new double[2 * n];

        //Опечатка, должно быть 2n

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < 2 * n; i++) {
            a[i] = Math.ceil((Math.random() * 200 - 100) * 100) / 100 ;
            System.out.print("[" + a[i] + "] ");
        }
        result = a[0] + a[2 * n - 1];

        for (int i = 1, j = (2 * n - 2); i < j; i++, j--) {
            if (a[i] + a[j] > result) {
                result = a[i] + a[j];
            }
        }

        System.out.println("\nРезуьтат: " + Math.ceil(result * 100) / 100);

    }
}
