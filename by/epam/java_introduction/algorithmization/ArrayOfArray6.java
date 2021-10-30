package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class ArrayOfArray6 {

    public static void main(String[] args) {

        int a[][];
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы(четная): ");
        n = in.nextInt();
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i + j <= i + i) || (i + j <= n - 1)) && ((i + j >= i + i) || (i + j >= n - 1))) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
