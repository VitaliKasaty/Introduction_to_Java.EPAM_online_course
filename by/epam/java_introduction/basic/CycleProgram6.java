package by.epam.java_introduction.basic;

import java.util.Scanner;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class CycleProgram6 {

    public static void main(String[] args) {

        String s;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите символы: ");
        s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println("Символ " + s.charAt(i) + " = " + (int)s.charAt(i));
        }

    }
}
