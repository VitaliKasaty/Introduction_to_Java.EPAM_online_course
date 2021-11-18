package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/* 
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Decomposition4 {

	public static void main(String[] args) {

		int n;
		double maxLength = 0;

		n = enterNumber("Введите количество точек n:");
		int a[] = new int[n * 2];
		int resultCoordinates[] = new int[4];

		createPointsArray(a);
		System.out.println();
		searchMaxLength(a, resultCoordinates, maxLength);
		
		System.out.println("Наибольшее расстояние между точками: [" 
							 + resultCoordinates[0] + ", " 
							 + resultCoordinates[1] + "] и ["
							 + resultCoordinates[2] + ", " 
							 + resultCoordinates[3] + "] ");

	}

	public static int enterNumber(String msg) {				/* Ввод числа с консоли  */
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

	public static void createPointsArray(int[] a) {			/* Заполнение значений точек случайными числами  */

		System.out.println("Сформированные координаты точек:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 - 50);
			if (i % 2 == 1) {
				System.out.print(((i + 1) / 2) + ")[" + a[i - 1] + ", " + a[i] + "] ");
			}

		}

	}

	public static double lengthFromPoints(int x1, int y1, int x2, int y2) {  /* Определение расстояния между двумя точками  */

		double length;

		length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		return length;
	}

	public static void searchMaxLength(int[] a, int[] resultCoordinates, double maxLength) {   /* Определение координат точек с наибольшим отдалением друг от друг  */

		for (int i = 0; i < a.length; i++) {
			double length;

			if (i % 2 == 1) {
				for (int j = i + 2; j < a.length; j++) {
					length = lengthFromPoints(a[i - 1], a[i], a[j - 1], a[j]);

					if (length > maxLength) {
						maxLength = length;
						resultCoordinates[0] = a[i - 1];
						resultCoordinates[1] = a[i];
						resultCoordinates[2] = a[j - 1];
						resultCoordinates[3] = a[j];
					}
					j++;
				}
			}

		}
	}

}
