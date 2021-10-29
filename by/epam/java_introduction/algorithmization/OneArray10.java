package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class OneArray10 {

    public static void main(String[] args) {

        int a[];
        int n;
        int countZero;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        n = in.nextInt();
        a = new int[n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
            System.out.print("[" + a[i] + "] ");
        }

        countZero = n / 2 ;
        if (n % 2 != 0) {
            countZero++;
        }

        for (int i = 1, j = 1; (i < n - 1) && (j <= countZero - 1); i++, j++) {
            a[i] = a[j * 2];
            a[j * 2] = 0;
        }

        for (int i = countZero; i < n; i++) {
            a[i] = 0;
        }

        System.out.println("\nСжатый массив c нулями: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + a[i] + "] ");
        }

    }
}
