package by.epam.java_introduction.string;

/*В строке найти количество цифр.*/

public class StringAsArray3 {
	
	public static void main(String[] args) {
		
		int count;
		
		String s = "jfhr639 f83 652 jfkslg 93 hhdh3h h3s";
		count = countDigitOfString(s);
		System.out.println("Количество цифр в строке = " + count);
	}
	
	public static int countDigitOfString(String s) {
		
		int count = 0;
		char ch;	
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;		
	}

}
