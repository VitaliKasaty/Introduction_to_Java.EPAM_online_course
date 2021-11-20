package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Decomposition17 {
	
	public static void main(String[] args) {
		
		int num;
		
		num = enterNumber("Введите число:");
		System.out.println("Количество операций = " + countOperation(num));

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

		return Math.abs(value);
	}
	
	public static int sumOfDigit(int num) {   //сумма цифр числа
		
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
	
	public static int countOperation (int num) { //количество вычитаний суммы цифр пока не равно 0
		
		int count = 0;
		
		while (num > 0) {
			num -= sumOfDigit(num);
			count++;
		}
		return count;
	}

}
