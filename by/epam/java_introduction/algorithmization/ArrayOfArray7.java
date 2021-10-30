package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка N по правилу: a[i, j] = sin((i^2 - j^2)/n)

public class ArrayOfArray7 {

    public static void main(String[] args) {

        double a[][];
        int n;
        int countPlus = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        n = in.nextInt();
        a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin(((i * i) - (j * j)) / (double) n);
                System.out.print("[" + a[i][j] + "] ");
                if (a[i][j] > 0) {
                    countPlus++;
                }
            }
            System.out.println();
        }
        System.out.println("Положительных элементов: " + countPlus);

    }
}
