package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Decomposition2 {
	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		int nod = 1;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = enterNumber("Введите число №" + (i + 1) + ":");	
			
			if (i < 1) {
				nod = a[i];
			} else {
				nod = nod(nod, a[i]);
			}	
			
		}
		
		System.out.println("Nod = " + nod);	
	
	}
	
	public static int enterNumber(String msg) { //Ввод числа с консоли и проверка его на корректность
		
		int value = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		while (value < 1) {			
			if (sc.hasNextInt()) {
				value = sc.nextInt();				
				if(value < 1) {
					System.out.println(msg);
				}				
			} else {
				sc.next();
				System.out.println(msg);
			}	
		} 		

		return value;
	}
	
	public static int nod(int a, int b) { // метод нахождения НОД

		while (a != 0 && b != 0) {
			if (a >= b) {
				a = a % b;
			} else if (b > a) {
				b = b % a;
			}
		}
		
		return a + b;
	}
	
}
