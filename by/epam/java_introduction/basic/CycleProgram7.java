package by.epam.java_introduction.basic;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

public class CycleProgram7 {

    public static void main(String[] args) {

        int m;
        int n;
        String dividers = "";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите m: ");
        m = in.nextInt();
        System.out.print("Введите n: ");
        n = in.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) dividers += Integer.toString(j) + " ";
            }

            if (dividers != "") {
                System.out.println("Делители числа " + i +" = " + dividers);
            }
            dividers = "";
        }

    }
}
