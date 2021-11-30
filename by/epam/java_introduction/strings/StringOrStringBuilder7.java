package by.epam.java_introduction.string;

import java.util.Scanner;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
*/

public class StringOrStringBuilder7 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb = inputStringFromConsole();

		deleteDuplicateSymbol(sb);
		System.out.println(sb);

	}
	
	public static StringBuilder inputStringFromConsole() {
		
		System.out.println("Введите строку:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.nextLine().toString());
		
		return s;
	}
	
	public static void deleteDuplicateSymbol(StringBuilder sb) {
		
		char ch;
		int firsIndex;
		int lastIndex;

		for (int i = 0; i < sb.length(); i++) {	
			
			ch = sb.charAt(i);
			firsIndex = sb.toString().indexOf(ch);
			lastIndex = sb.toString().lastIndexOf(ch);
			
			if (firsIndex != lastIndex && ch != ' ') {
				sb.deleteCharAt(lastIndex);
				i--;
			}			
			if (ch == ' ') {
				sb.deleteCharAt(i);
				i--;
			}		
		}
	}
	
}
