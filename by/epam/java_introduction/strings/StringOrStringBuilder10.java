package by.epam.java_introduction.string;

import java.util.Scanner;

/*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.*/

public class StringOrStringBuilder10 {
	
	public static void main(String[] args) {
		
		String x;
		int count;
		
		x = inputStringFromConsole();
		count = countSentenceInText(x);
		System.out.println("Количество предложений в тексте - " + count);
		
	}
	
	public static String inputStringFromConsole() { 
		
		String s = "";		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(s == "") { // Введеная строка может быть пустой
			System.out.println("Введите строку");
			s = sc.nextLine();
		}			
		return s;
	}
	
	public static int countSentenceInText(String text) {
		
		int result = 0;
		char ch;
		
		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			if (ch == '.' || ch == '!' || ch =='?') {
				result++;
			}
		}
		return result;
	}	
	
}
