package by.epam.java_introduction.algorithmization;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Decomposition3 {

	public static void main(String[] args) {
		
		int a;		
		double squareHexagon;
		
		a = enterNumber("Введите сторону a:");
		squareHexagon = squareHexagon(a);
		
		System.out.println("Площадь = " + squareHexagon);	
		
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
	
	public static double squareHexagon(int a) {
		
		double squareTriangle;
		double squareHexagon;
		
		squareTriangle = 0.5 * Math.pow(a, 2) * Math.sin(Math.toRadians(120));
		squareHexagon = 6 * squareTriangle;
		
		return squareHexagon;		
	}
	
}
