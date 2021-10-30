package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

public class ArrayOfArray3 {

    public static void main(String[] args) {

        int a[][];
        int m;
        int n;
        int k;
        int p;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        m = in.nextInt();
        System.out.print("Введите число столбцов: ");
        n = in.nextInt();
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.print("Введите k-ю строку для вывода: ");
        k = in.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.print("[" + a[k - 1][j] + "] ");
        }

        System.out.print("\nВведите p-й столбец для вывода: ");
        p = in.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("[" + a[i][p - 1] + "]");
        }

    }
}
