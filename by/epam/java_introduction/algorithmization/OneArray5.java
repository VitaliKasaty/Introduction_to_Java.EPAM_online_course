package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class OneArray5 {

    public static void main(String[] args) {

        int a[];
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new int[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++){
            a[i] = (int) (Math.random() * 10) ;
            System.out.print("[" + a[i] + "] ");
        }

        System.out.println("\nРезультат: ");
        for (int i = 0; i < n; i++) {
            if (a[i] > i + 1) {
                System.out.print("[" + a[i] + "] ");
            }
        }

    }
}
