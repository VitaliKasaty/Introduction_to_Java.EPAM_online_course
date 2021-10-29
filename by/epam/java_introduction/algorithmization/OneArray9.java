package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class OneArray9 {

    public static void main(String[] args) {

        int a[];
        int n;
        int countElement[];
        int resultCount;
        int resultNum;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new int[n];
        countElement = new int[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print("[" + a[i] + "] ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    countElement[i]++;
                }
            }
        }

        resultCount = countElement[0];
        resultNum = a[0];

        for (int i = 1; i < n; i++) {
            if (countElement[i] > resultCount) {
                resultCount = countElement[i];
                resultNum = a[i];
            }
            if ((countElement[i] == resultCount) && (a[i] < resultNum)) {
                resultNum = a[i];
            }
        }
        System.out.println("\nРеультат = " + resultNum);

    }
}
