package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/* Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).   
   Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
   решения задачи использовать декомпозицию.*/

public class Decomposition13 {

	public static void main(String[] args) {

		int n;

		n = enterNumber("Введите n");
		System.out.println("Простые числа близнецы на отрезке от " + n + " до " + (2 * n) + ":");
		twinNumber(n, 2 * n);
	}

	public static int enterNumber(String msg) { // Ввод числа с консоли и проверка его на корректность

		int value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);

		while (value < 3) { // пока не введено число больше 2
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value < 3) {
					System.out.println(msg);
				}
			} else {
				sc.next();
				System.out.println(msg);
			}
		}

		return value;
	}

	public static boolean isSimpleNumber(int a) { //проестое ли число

		boolean isSimple = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isSimple = false;
				break;
			}
		}

		return isSimple;
	}

	public static void twinNumber(int n1, int n2) { //вывод на печать если i и i + 2 простые числа

		for (int i = n1; i <= n2 - 2; i++) {
			if (isSimpleNumber(i) && isSimpleNumber(i + 2)) {
				System.out.println(i + ", " + (i + 2));
			}
		}
	}

}
