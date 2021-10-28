package by.epam.java_introduction.basic;

import java.util.Scanner;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class CycleProgram2 {

    public static void main(String[] args) {

        int a;
        int b;
        int h;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите начало отрезка a ");
        a = in.nextInt();
        System.out.print("Введите конец отрезка b ");
        b = in.nextInt();
        System.out.print("Введите шаг h ");
        h = in.nextInt();

        System.out.println("Значения функции:");

        for (int i = a; i <= b; i++) {
            if (i > 2) {
                System.out.print(i + " ");
                i += h - 1;
            } else {
                System.out.print(i * -1 + " ");
                i += h - 1;
            }
        }

    }
}
