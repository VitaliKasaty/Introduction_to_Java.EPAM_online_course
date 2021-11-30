package by.epam.java_introduction.string;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем*/

public class StringOrStringBuilder1 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello world    test           first");
		
		System.out.println("Наибольшее количество подряд идущих пробелов = " + maxSpacesIntString(sb));
	}
	
	public static int maxSpacesIntString(StringBuilder sb) {
		
		int maxSpace = 0;
		int space = 0;
		
		for (int i = 0; i < sb.length(); i++) {			
			if(sb.charAt(i) == ' ') {
				space++;
			} else {
				if (space > maxSpace) {
					maxSpace = space;
				}
				space = 0;
			}
		}
		return maxSpace;
	}

}
