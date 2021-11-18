package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Decomposition5 {

	public static void main(String[] args) {

		int a[];
		int n;
		int secondMaxElem;

		n = enterNumber("Введите размер массива n:");
		a = new int[n];
		createArray(a);
		secondMaxElem = getSecondMaxElem(a);

		System.out.println("\nПредмаксимальный элеммент: " + secondMaxElem);

	}

	public static int enterNumber(String msg) { /* Ввод числа с консоли */
		int value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);

		while (value < 2) {
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value < 2) {
					System.out.println(msg);
				}
			} else {
				sc.next();
				System.out.println(msg);
			}
		}

		return value;
	}

	public static void createArray(int[] a) { /* Заполнение массива случайными элементами */

		System.out.println("Сформированный массив:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.print("[" + a[i] + "] ");
		}

	}

	public static int getSecondMaxElem(int[] a) {

		int maxElem = a[0];
		int secondMaxElem = Integer.MIN_VALUE;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxElem) {
				secondMaxElem = maxElem;
				maxElem = a[i];
			} else if (a[i] > secondMaxElem) {
				secondMaxElem = a[i];
			}
		}
		return secondMaxElem;
	}

}
