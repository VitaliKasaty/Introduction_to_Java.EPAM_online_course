package by.epam.java_introduction.basic;

import java.util.Scanner;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:

public class CycleProgram5 {

    public static void main(String[] args) {

        int n;
        double e ;
        double item;
        double sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n ");
        n = in.nextInt();
        System.out.print("Введите число e ");
        e = in.nextDouble();

        for (int i = 1; i <= n; i++) {
            item = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(item) >= e) sum += item;
        }

        if (sum == 0) {
            System.out.println("По заданным параметрам подходящих членов ряда не существует!");
        }
        else {
            System.out.println("Сумма ряда = " + sum);
        }

    }
}
