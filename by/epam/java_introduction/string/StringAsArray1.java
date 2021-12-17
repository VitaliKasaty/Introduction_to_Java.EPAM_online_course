package by.epam.java_introduction.string;

import java.util.Scanner;

/*Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/

public class StringAsArray1 {
	
	public static void main(String[] args) {
		
		String firstString;
		String varArray[];		
		
		firstString = inputStringOfVar();
		varArray = firstString.split(" ");
		camelToSnake(varArray);
		System.out.println("Приведение к snake_case:");
		printStringArray(varArray);	
		
	}
	
	public static String inputStringOfVar() { //Чтение с консоли исходных данных
		
		String s = "";		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(s == "") { // Введеная строка может быть любая, но не пустой
			System.out.println("Введите названия переменных через пробел");
			s = sc.nextLine();
		}			
		return s;
	}
	
	public static void camelToSnake(String s[]) { //Приведение строки к виду snake_case
		
		char ch;
		String toSnake = "";
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				ch = s[i].charAt(j);
				if (Character.isUpperCase(ch)) {
					toSnake += "_" + Character.toLowerCase(ch);
				} else {
					toSnake += ch;
				}				
			}
			s[i] = toSnake;
			toSnake = "";
		}	
	}
	
	public static void printStringArray(String s[]) { //Вывод результата
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}	
	}
	

}
