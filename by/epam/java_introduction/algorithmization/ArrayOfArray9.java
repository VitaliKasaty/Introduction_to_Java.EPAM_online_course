package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.


public class ArrayOfArray9 {

    public static void main(String[] args) {

        int a[][];
        int m;
        int n;
        int maxSum = 0;
        int tempSum = 0;
        int maxColumn = 0;
        int sumColumn = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        m = in.nextInt();
        System.out.print("Введите число столбцов: ");
        n = in.nextInt();
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10) + 1;
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        for (int j = 0; j < n; j++) {
            sumColumn = 0;
            for (int i = 0; i < m; i++) {
                tempSum += a[i][j];
                sumColumn += a[i][j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxColumn = j + 1;
            }
            tempSum = 0;
            System.out.println("В " + (j+1) + " столбце сумма элементов = " + sumColumn);
        }
        System.out.println("Максимальная сумма элементов в столбце - " + maxColumn);

    }
}
