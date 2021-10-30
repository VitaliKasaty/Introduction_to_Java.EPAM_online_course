package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class ArrayOfArray4 {

    public static void main(String[] args) {

        int a[][];
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы(четная): ");
        n = in.nextInt();
        a = new int[n][n];

        System.out.println("Сформированная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + 1) % 2 == 1){
                    a[i][j] = j + 1;
                    System.out.print("[" + a[i][j] + "] ");
                } else {
                    a[i][j] = n - j;
                    System.out.print("[" + a[i][j] + "] ");
                }
            }
            System.out.println();
        }

    }
}
