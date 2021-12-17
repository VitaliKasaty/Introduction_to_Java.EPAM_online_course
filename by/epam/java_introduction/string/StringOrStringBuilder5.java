package by.epam.java_introduction.string;

/*Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/

public class StringOrStringBuilder5 {

	public static void main(String[] args) {
		
		String str = "grammar sun java darida aqua";

		System.out.println("Количество вхождений символа в строку = " + countSymbol(str, 'a'));
	}
	
	public static int countSymbol(String str, char a) {
		
		int count = 0;
		
		while (str.indexOf(a) != -1) {
			count++;
			str = str.substring(str.indexOf(a) + 1);
		}	
		
		return count;
	}
	
}
