package by.epam.java_introduction.algorithmization;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class Decomposition7 {

	public static void main(String[] args) {

		int result;

		result = sumFactorial(9);
		System.out.println("Результат = " + result);
	}

	
	public static int sumFactorial(int a) {

		int sum = 0;
		int factorial = 1;

		for (int i = 1; i <= a; i++) {
			factorial *= i;
			if (i % 2 == 1) {
				sum += factorial;
			}
		}
		return sum;
	}

}
