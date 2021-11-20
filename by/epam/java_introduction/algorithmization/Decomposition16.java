package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class Decomposition16 {
	
	public static void main(String[] args) {
		
		int n;
		int a[] = new int[10]; //массив где будут хранится случайные n-значные числа
		int sum;
		
		n = enterNumber("Введите количество знаков в числе:");
		generateNumber(a, n);
		sum = sumDigit(a);
		System.out.println("\nСумма чисел с нечётными цифрами = " + sum);	
		System.out.println("Количество чётных цифр в полученной сумме = " + countEvenDigit(sum));
	}
	
	public static int enterNumber(String msg) { // Ввод числа с консоли и проверка его на корректность

		int value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);

		while (value < 1 || value > 10) { //в int максимально 10 знаков
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value < 1 || value > 10) {
					System.out.println(msg);
				}
			} else {
				sc.next();
				System.out.println(msg);
			}
		}
		return value;
	}
	
	public static void generateNumber(int a[], int n) { //создание массива со случайными подходящими числами 
		
		System.out.println("Сформированные числа:");
		for (int i = 0; i < a.length; i++) {
			//генерация чисел с n количеством знаков
        	a[i] = (int) (Math.random() * (Math.pow(10, n) - Math.pow(10, n - 1)) + Math.pow(10, n - 1)); 
        	System.out.print("[" + a[i] + "] ");
		}		
	}
	
	public static boolean isOddDigit(int num) { //Проверка на то, являются ли все цифры в числе нечётными
		
		int temp;
		boolean isOdd = true;
		
		while (num > 0) {
			temp = num % 10;	
			num /= 10;
			if (temp % 2 == 0) {
				isOdd = false;
				break;
			}
		}
		return isOdd;
	}	
	
	public static int sumDigit(int a[]) { //вычисление суммы n - значных чисел, содержащих только нечетные цифры
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (isOddDigit(a[i])) {
				sum += a[i];
			}			
		}
		return sum;
	}
	
	public static int countEvenDigit(int num) { //подсчёт кол-ва чётных цифр в числе
		
		int temp;
		int count = 0;
		
		while (num > 0) {
			temp = num % 10;	
			num /= 10;
			if (temp % 2 == 0) {
				count++;
			}
		}
		return count;		
	}

}
