package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class ArrayOfArray1 {

    public static void main(String[] args) {

        int a[][];
        int m;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        m = in.nextInt();
        System.out.print("Введите число столбцов: ");
        n = in.nextInt();
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (((j + 1) % 2 == 1) && (a[0][j] > a[m - 1][j])) {
                        System.out.print("[" + a[i][j] + "] ");
                }
            }
            System.out.println();
        }

    }
}
