package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

public class Decomposition11 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = enterNumber("Введите первое число:");
		b = enterNumber("Введите второе число:");
		maxLengthNumber(a, b);

	}

	public static int enterNumber(String msg) { //Ввод числа с консоли и проверка его на корректность
		
		int value = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		while (!sc.hasNextInt()) {	
				sc.next();
				System.out.println(msg);
		}		 
		value = sc.nextInt();

		return value;
	}
	
	public static void maxLengthNumber(int a, int b) {
		
		int lengthA;
		int lengthB;
		
		lengthA = String.valueOf(Math.abs(a)).length();
		lengthB = String.valueOf(Math.abs(b)).length();
		
		if (lengthA > lengthB) {
			System.out.println("В первом числе больше цифр.");
		} else if (lengthA < lengthB) {
			System.out.println("Во втором числе больше цифр.");
		} else {
			System.out.println("Количество цифр одинаково.");
		}		
	}
	
}
