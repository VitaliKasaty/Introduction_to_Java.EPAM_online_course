package by.epam.java_introduction.class_programming.text;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/ 

public class Text {
	
	private String title;
	private StringBuilder text;
	
	public Text(String title, Sentence... sentence) { 	
		this.title = title;
		text = new StringBuilder();
		
		for (int i = 0; i < sentence.length; i++) {	
			
			if (i > 0) {
				text.append(" "); //пробел перед новым предложением
			}
			text.append(sentence[i]);	
		}		
	}
	
	public void addToText(Sentence sentence) {
		text.append(" ");
		text.append(sentence);		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public StringBuilder getText() {
		return text;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}	

}
