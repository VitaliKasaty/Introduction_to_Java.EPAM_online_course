package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/* Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.*/

public class Decomposition10 {
	
	public static void main(String[] args) {
		
		int n;
		int a[];
		int countNumber;
		
		n = enterNumber("Введите N:");
		countNumber = String.valueOf(n).length();
		a = new int[countNumber];
		createArray(a, n);
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
	
	public static void createArray(int a[], int n) {
		
		int num;
		
		for (int i = 0; i < a.length; i++) {
			num = n % 10;
			a[i] = num;
			n /= 10;			
		}
	}

}
