package by.epam.java_introduction.algorithmization;

/* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Decomposition8 {
	
	public static void main(String[] args) {
		
		int d[] = new int[30];
		int k = 2;
		int m = 7;
		
		createArray(d);
		System.out.println("Суммы трех последовательных элементов от k до m:");
		resultOfInterval(d, k, m);

	}
	
	public static void createArray(int[] d) { /* Заполнение массива случайными элементами */

		System.out.println("Сформированный массив:");
		for (int i = 0; i < d.length; i++) {
			d[i] = (int) (Math.random() * 100);
			System.out.print("[" + d[i] + "] ");
		}
		System.out.println();
	}
	
	public static int sumOfTriple(int[] d, int startPos) { /* Вычисление суммы трёх последовательных элементов */
		
		int sum = 0;
		
		for (int i = startPos; i < startPos + 3; i++) {
			sum += d[i];
		}
		return sum;			
	}
	
	public static void resultOfInterval(int[] d, int k, int m) { /* Печать сумм всех последовательных троек в интервале */
		
		int sum;		
		
		for (int i = k - 1; i <= m - 3; i++) {
			sum = sumOfTriple(d, i);
			System.out.println(sum);
		}			
	}	

}
