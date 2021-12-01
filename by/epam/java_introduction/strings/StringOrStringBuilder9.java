package by.epam.java_introduction.string;

import java.util.Scanner;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.*/

public class StringOrStringBuilder9 {
	
	public static void main(String[] args) {
		
		String text;
		int[] result;
		
		result = new int[2]; // для хранения количества мелких и больших букв
		text = inputStringFromConsole();		
		countEngLetter(text, result);
		
		System.out.println("Количество английских строчных букв - " + result[0] + ", прописных - " + result[1]);
		
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
	
	public static void countEngLetter(String s, int[] result) {
		
		int smallLetter = 0;
		int bigLetter = 0;
		char ch;
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);			
			if ((ch >= 'a') && (ch <= 'z')) {
				smallLetter++;
			} else if ((ch >= 'A') && (ch <= 'Z')) {
				bigLetter++;
			}
		}		
		result[0] = smallLetter;
		result[1] = bigLetter;
	}

}
