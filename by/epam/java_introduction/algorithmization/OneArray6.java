package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class OneArray6 {

    public static void main(String[] args) {

        double a[];
        int n;
        double sum = 0;
        boolean isSimple;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new double[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++){
            a[i] = Math.ceil( (Math.random() * 200 - 100) * 100) / 100 ;
            System.out.print("[" + a[i] + "] ");
        }
        System.out.println();

        for (int i = 2; i <= n; i++) {
            isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                sum += a[i-1];
            }
        }

        System.out.println("Резуьтат: " + sum);

    }
}
