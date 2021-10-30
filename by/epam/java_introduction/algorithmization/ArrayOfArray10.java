package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Найти положительные элементы главной диагонали квадратной матрицы

public class ArrayOfArray10 {

    public static void main(String[] args) {

        int a[][];
        int m;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        m = in.nextInt();
        a = new int[m][m];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (Math.random() * 20 - 10) ;
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Положительные элементы главной диагонали: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == j) && (a[i][j] > 0)) {
                    System.out.print("[" + a[i][j] + "] ");
                }
            }
        }

    }
}
