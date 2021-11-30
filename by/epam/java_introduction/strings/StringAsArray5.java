package by.epam.java_introduction.string;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/

public class StringAsArray5 {
	
	public static void main(String[] args) {
		
		String s = "  test  prog static   string  array      void ";
		String result;
		
		result = goodSpacesInString(s);
		System.out.println(result);

	}
	
	public static String goodSpacesInString(String s) { //возвращает строку с правильно оформленными пробелами
		
		String newString = "";
		char ch;
		int i = 0;
		s = s.trim(); // обрезает пробелы по краям
		
		while (i < s.length()) {
			ch = s.charAt(i);
			newString += ch;
			i++;
			if (ch == ' ') {
				i = posAfterSpace(s, i); 
			}
		}		
		return newString;
	}
	
	public static int posAfterSpace(String s, int startPos) { //получает на вход индекс элемента равный пробелу
														     //ищет индекс элемента(!= ' ') после пробела		                                             
		char ch;                                             
		int posNoSpace = 0;
		
		for (int i = startPos; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch != ' ') {
				posNoSpace = i;
				break;
			}
		}
		return posNoSpace;
	}

}
