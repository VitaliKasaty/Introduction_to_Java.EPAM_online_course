package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.*/

public class Decomposition14 {

	public static void main(String[] args) {

		int k;
		k = enterNumber("Введите k:");
		armstrongFromInterval(k);
	}

	public static int enterNumber(String msg) { // Ввод числа с консоли и проверка его на корректность

		int value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);

		while (value < 1) {
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value < 1) {
					System.out.println(msg);
				}
			} else {
				sc.next();
				System.out.println(msg);
			}
		}

		return value;
	}

	public static boolean isArmstrongNumber(int a) {

		int tempA = a;
		int n = 0;
		int sum = 0;

		while (tempA > 0) { // нахождение кол-ва цифр в числе
			tempA /= 10;
			n++;
		}

		tempA = a;
		while (tempA > 0) { // нахождение суммы цифр числа возводимых в степень n
			sum += Math.pow(tempA % 10, n);
			tempA /= 10;
		}

		if (sum == a) { // если равны, то это число Армстронга
			return true;
		} else {
			return false;
		}
	}

	public static void armstrongFromInterval(int k) {

		System.out.println("Числа Армстронга в промежутке от 1 до " + k + ":");
		for (int i = 1; i <= k; i++) {
			if (isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
