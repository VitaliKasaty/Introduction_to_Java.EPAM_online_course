package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми*/

public class Decomposition6 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int resultNod;
		
		a = enterNumber("a>>");
		b = enterNumber("b>>");
		c = enterNumber("c>>");
		
		resultNod = nod(nod(a, b), c); //Три числа взаимно простые, если их НОД = 1
		
		if (resultNod == 1) {
			System.out.println("Числа являются взаимно простыми");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}
		

	}
	
	public static int enterNumber(String msg) { /* Ввод числа с консоли */
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
	
	public static int nod(int a, int b) { // метод нахождения НОД, в том числе и у отрицательных чисел
		
		a = Math.abs(a);
		b = Math.abs(b);

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
