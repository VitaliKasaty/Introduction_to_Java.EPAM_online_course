package by.epam.java_introduction.class_programming.text;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. */

public class Word {   
					 
	private String word; 		//Объект класса "Слово" содержит стринговое поле, слова могут повторятся и будут браться 
								//из строкового пула, а значит расход памяти меньше.
	public Word(String word) {		
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}	

}