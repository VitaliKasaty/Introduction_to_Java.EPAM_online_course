package by.epam.java_introduction.string;

/*Из заданной строки получить новую, повторив каждый символ дважды.*/

public class StringOrStringBuilder6 {
	
	public static void main(String[] args) {		
		
		StringBuilder sb = new StringBuilder("grammar sun java darida aqua");
		StringBuilder result = new StringBuilder(repeatSymbol(sb));//

		System.out.println(result);
	}
	
	public static StringBuilder repeatSymbol(StringBuilder sb) {
		
		StringBuilder result = new StringBuilder(sb);
		
		for (int i = 0; i < sb.length(); i++) {	
			result = result.insert(i, result.charAt(i));
			i++;			
		}
		return result;
	}

}
