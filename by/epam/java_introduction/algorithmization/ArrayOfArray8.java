package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class ArrayOfArray8 {

    public static void main(String[] args) {

        int a[][];
        int m;
        int n;
        int column1;
        int column2;
        int temp;

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

        System.out.print("Введите номер первого столбца: ");
        column1 = in.nextInt();
        System.out.print("Введите номер другого столбца: ");
        column2 = in.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == column1 - 1) {
                    temp = a[i][column1 - 1];
                    a[i][column1 - 1] = a[i][column2 - 1];
                    a[i][column2 - 1] = temp;
                }
            }
        }

        System.out.println("Результат: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
