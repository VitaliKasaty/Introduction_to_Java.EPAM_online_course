package by.epam.java_introduction.algorithmization;

import com.sun.jdi.DoubleValue;

import java.util.Scanner;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class OneArray4 {

    public static void main(String[] args) {

        double a[];
        int n;
        double maxNum;
        double minNum;
        int maxIndex;
        int minIndex;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new double[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = Math.ceil((Math.random() * 200 - 100) * 100) / 100 ;
            System.out.print("[" + a[i] + "] ");
        }

        maxNum = a[0];
        minNum = a[0];
        maxIndex = 0;
        minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] >= maxNum) {
                maxNum = a[i];
                maxIndex = i;
            } else {
                minNum = a[i];
                minIndex = i;
            }
        }

        a[maxIndex] = minNum;
        a[minIndex] = maxNum;

        System.out.println("\nКонечный массив: ");
        for (int i = 0; i < n; i++) {
             System.out.print("[" + a[i] + "] ");
        }

    }
}
