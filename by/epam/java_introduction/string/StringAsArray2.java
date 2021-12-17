package by.epam.java_introduction.string;

/*Замените в строке все вхождения 'word' на 'letter'.*/

public class StringAsArray2 {
	
	public static void main(String[] args) {

		String s = "word lesson key hugo begin words smartword englwordwoed";
		String result;

		result = s.replace("word", "letter"); //вариант простой
		System.out.println(result);	
		result = replaseWords(s, "word", "letter"); //замена слов через собственный метод
		System.out.println(result);	
	}	
	
	public static String replaseWords(String s, String firstWord, String secondWord) {
		
		String result = "";
		boolean isIdentical = false; //есть ли совпадение слов
		
		for (int i = 0; i < s.length() ; i++) {
			
			isIdentical = false;
		     
			if ((s.charAt(i) == firstWord.charAt(0)) ) { //если есть совпадение в символе строки с символом первого слова.
				                                        //проходимся дальше со второго и до конца или до несовпадения
				for (int j = 1; j < firstWord.length(); j++) {					
					if (firstWord.charAt(j) == s.charAt(i + j)) {
						isIdentical = true;  //пока что вхождение имеется						
					} else {
						isIdentical = false; //если хоть один символ не совпал, то вхождения не получится
						break;
					}	
				}	
			} 
			
			if (isIdentical) { //добавление в результат второго слова на место первого и итератор перепрыгивает первое слово в строке
				result += secondWord; 
				i += firstWord.length() - 1;
			} else {
				result += s.charAt(i); // если никаких совпадений небыло, то посимвольно копируем в результат
			}			
		}
		
		return result;
	}
	
}
