package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class Decomposition15 {
	
	public static void main(String[] args) {
		
		int n;		
		n = enterNumber("Введите n:");
		incSequence(n);
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
	
	public static void incSequence(int n) {
		
		int startPos = (int) Math.pow(10, n - 1); //минимальное n-значное число
		int lastPost = (int) Math.pow(10, n);     //максимальное n-значное число
		
		for (int i = startPos; i < lastPost; i++) {
			if (isIncreasingNumber(i)) {         //если в числе i цифры стоят по возрастанию
				System.out.println(i);
			}
		}		
	}
	
	public static boolean isIncreasingNumber(int num) { //проверка цифр числа на условие возрастания
		
		boolean isIncreasing = true;
		int rightDigit;                     
		int leftDigit;		                
		
		while (num > 0) {                   //пока не перебрали все цифры в числе путём деления
			rightDigit = num % 10;          //последняя цифра
			num /= 10;                      //отсекается последняя цифра
			leftDigit = num % 10;           //берется цифра перед последней		
			if (rightDigit <= leftDigit) {  //последняя цифра должна быть > предпоследней, иначе выход
				isIncreasing = false;
				break;
			}			
		}		
		return isIncreasing;
	}

}
