package by.epam.java_introduction.string;

import java.util.Scanner;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/

public class StringOrStringBuilder8 {
	
	public static void main(String[] args) {
		
		String str;
		String maxString;
		
		str = inputStringFromConsole();
		maxString = maxLengthWord(str);
		
		if (maxString != null) { // null в случае нескольких длинных слов, не обрабатываем
			System.out.println("Самое длинное слово - " + maxString);
		}

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
	
	public static String maxLengthWord(String s) {
		
		String[] words = s.split(" ");
		String result = "";
		int maxlength = 0;	
		int indexMaxString = 0;

		for (int i = 0; i < words.length; i++) { //проход по массиву с поиском слова максимальной длины, пока не знаем кол-во самых длинных слов
			 if (words[i].length() > maxlength) {
				 maxlength = words[i].length();
				 result = words[i];
				 indexMaxString = i;
			 }			
		}
		
		for (int i = 0; i < words.length; i++) { //если есть другое максимальное слово, кроме найденного выше, то вывод null
			if ((words[i].length() == maxlength) && (indexMaxString != i)) {
				result = null;
				break;
			}
		}
		
		return result;
	}
	
}
