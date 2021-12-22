package by.epam.java_introduction.class_programming.text;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/ 

public class Main {
	
	public static void main(String[] args) {
		
		Word word1 = new Word("Hello"); 
		Word word2 = new Word("Java");
		Word word3 = new Word("World!");
		
		Word word4 = new Word("Programming");
		Word word5 = new Word("is");
		Word word6 = new Word("good.");
		
		Sentence sentence1 = new Sentence(word1, word2, word3);	
		Sentence sentence2 = new Sentence(word4, word5, word6);
		
		Text text1 = new Text("Learn java!", sentence1, sentence2); 
		System.out.println(text1.getTitle());
		System.out.println(text1.getText());
		
		System.out.println();
		text1.addToText(new Sentence(new Word("Added"), new Word("to"), new Word("text."))); //Дополнение текста путем создания объекта "Предложение" и "Слов" в нём 
		System.out.println(text1.getTitle());
		System.out.println(text1.getText());	
		
	}

}
