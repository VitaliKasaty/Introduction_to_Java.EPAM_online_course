package by.epam.java_introduction.class_programming.text;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. */

public class Sentence {
	
	private StringBuilder sentence; 

	public Sentence(Word... word) { 
		
		sentence = new StringBuilder();
		
		for (int i = 0; i < word.length; i++) {
			
			sentence.append(word[i]);
			
			if (i < word.length -1) { //между словами должен быть пробел, кроме последнего
				sentence.append(" ");
			}			
		}
	}
	
	@Override
	public String toString() {
		return sentence.toString();
	}

	public StringBuilder getSentence() {
		return sentence;
	}

	public void setSentence(StringBuilder sentence) {
		this.sentence = sentence;
	}	
	
}
