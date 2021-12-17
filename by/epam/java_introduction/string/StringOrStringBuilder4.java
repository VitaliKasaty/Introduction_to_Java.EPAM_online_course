package by.epam.java_introduction.string;

/*С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”*/

public class StringOrStringBuilder4 {
	
	public static void main(String[] args) {
		
		String firstString = "информатика";
		
		System.out.println(transformWord(firstString));		

	}
	
	public static String transformWord (String firstString) {
		
		String secondWord = "";
		
		secondWord = secondWord.concat(String.copyValueOf(firstString.toCharArray(), firstString.indexOf('т'), 1));
		secondWord = secondWord.concat(String.copyValueOf(firstString.toCharArray(), firstString.indexOf('о'), 1));
		secondWord = secondWord.concat(String.copyValueOf(firstString.toCharArray(), firstString.indexOf('р'), 1));
		secondWord = secondWord.concat(String.copyValueOf(firstString.toCharArray(), firstString.indexOf('т'), 1));
		
		return secondWord;
	}

}
