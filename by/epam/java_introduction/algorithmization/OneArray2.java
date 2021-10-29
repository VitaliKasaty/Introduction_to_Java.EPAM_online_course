package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class OneArray2 {

    public static void main(String[] args) {

        double a[];
        int n;
        double z;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        System.out.print("Введите число Z: ");
        z = in.nextDouble();
        a = new double[n];

        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = Math.ceil((Math.random() * 200 - 100) * 100) / 100 ;
            System.out.print("[" + a[i] + "] ");
        }

        System.out.println("\nКонечный массив: ");
        for (int i = 0; i < n; i++) {
            if (a[i] > z) a[i] = z;
            System.out.print("[" + a[i] + "] ");
        }

    }
}
