package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел. НОК(A, B) = (A * B) / НОД(A, B).

public class Decomposition1 {

	public static void main(String[] args) {

		int a;
		int b;
		int nod;
		int nok;

		a = enterNumber("Введите a:");
		b = enterNumber("Введите b:");
		nod = nod(a, b);
		nok = nok(a, b);
		
		System.out.println("NOD(" + a + ", " + b + ") = " + nod);
		System.out.println("NOK(" + a + ", " + b + ") = " + nok);

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
	
	
	public static int nok(int a, int b) { // метод нахождения НОК
		
		int res;
		res = (a * b) / nod(a, b);
		
		return res;
	}

}
