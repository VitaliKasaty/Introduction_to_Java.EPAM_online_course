package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Decomposition12 {
	
	public static void main(String[] args) {
		
		int k;
		int n;
		int a[];
		int sizeArray;
		
		k = enterNumber("Введите k:");
		n = enterNumber("Введите n:");
		sizeArray = sizeArray(k, n);
		a = new int[sizeArray];
		resultArray(k, n, a);
		printArray(a);
		
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
	
	public static int sumOfDigits(int num) { //сумма цифр в числе
		
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
	public static int sizeArray(int k, int n) { //вычисление размерности массива А исходя из введенных начальных данных
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {	//если находит число удовлетворяющее начальному условию, то инкрементируем счётчик	
			if (sumOfDigits(i) == k) {
				count++;
			}			
		}
		return count;	//количество найденных чисел и равняется размерностью массива	
	}
	
	public static void resultArray(int k, int n, int a[]) { //метод сравним с верхним, но здесь найденные числа заносятся в массив
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {	
			if (sumOfDigits(i) == k) {
				a[count] = i;
				count++;
			}			
		}				
	}
	
	public static void printArray(int a[]) { //Вывод на экран результата
		
		if (a.length == 0) {
			System.out.println("По заданным параметрам чисел не существует!");
		} else {
			System.out.println("Результат:");
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}		
	}
	
}
