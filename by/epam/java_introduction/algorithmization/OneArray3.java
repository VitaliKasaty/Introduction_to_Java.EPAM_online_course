package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class OneArray3 {

    public static void main(String[] args) {

        double a[];
        int n;
        int plusNum = 0;
        int minusNum = 0;
        int zeroNum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new double[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = Math.ceil((Math.random() * 200 - 100) * 100) / 100 ;
            System.out.print("[" + a[i] + "] ");
            if (a[i] > 0) {
                plusNum++;
            } else if (a[i] < 0) {
                minusNum++;
            }
            else {
                zeroNum++;
            }
        }

        System.out.println("\nПоложительных чисел " + plusNum + ", отрицательных чисел " + minusNum + ", нулевых элементов " + zeroNum);

    }
}
