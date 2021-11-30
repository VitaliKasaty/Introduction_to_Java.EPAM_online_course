package by.epam.java_introduction.string;

/*Проверить, является ли заданное слово палиндромом*/

public class StringOrStringBuilder3 {
	
	public static void main(String[] args) {
		
		String str = "Kazak";
				
		System.out.println(isPalindrome(str));		
		
	}

	public static boolean isPalindrome(String str) {
		
		String temp;					 
		
		temp =  new StringBuilder(str).reverse().toString(); 
		
		if (temp.equalsIgnoreCase(str)) {
			return true;
		} else {
			return false;
		}

	}
	
}
