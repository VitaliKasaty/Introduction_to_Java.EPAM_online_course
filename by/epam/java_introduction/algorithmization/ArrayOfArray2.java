package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class ArrayOfArray2 {

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
                a[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == j) || (i + j == m - 1)) {
                    System.out.print("[" + a[i][j] + "] ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

    }
}
