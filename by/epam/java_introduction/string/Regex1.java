package by.epam.java_introduction.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.*/

public class Regex1 {
	
	public static char ch; //переменная для третьего условия(сортировки лексем по символу). Глобальная, потому что будет использоваться в компараторе, а туда передать её нельзя. Или я пока не всё знаю..
	
	public static void main(String[] args) {

		startProgram();
	}
	
public static void startProgram() {
		
		int value = 0;
		String text = inputText();		
		System.out.println(text);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("""
					Выберите действие:
					1)Отсортировать абзацы по количеству предложений.
					2)В каждом предложении отсортировать слова по длине.
					3)Отсортировать лексемы по количеству вхождений символа, а при их равенстве - по алфавиту.
					4)Вернуть исходный текст.
					5)Выход.
					""");
			while (value < 1) { //проверка на корректность вводимых значений
				if (sc.hasNextInt()) {
					value = sc.nextInt();
					if (value < 1 || value > 5) {
						System.out.println("Введите корректно!");
					}
				} else {
					sc.next();
					System.out.println("Введите корректно!");
				}				
			}			
			
			switch (value) {
				case 1 -> {
					text = sortParagraphByCountSentences(text);
					System.out.println(text);
					value = 0;
				}
				case 2 -> {
					text = sortWordsInSentences(text, "byLengthWords");
					System.out.println(text);
					value = 0;
				}
				case 3 -> {
					System.out.println("Введите одиночный символ для поиска:");
					while (ch == '\u0000') { //значение по умолчанию для char						
						String input = sc.nextLine();
						if (input.length() == 1) {
							ch = input.charAt(0);
						} 
					} 					
					text = sortWordsInSentences(text, "byCountCharInWords");
					System.out.println(text);
					ch = '\u0000';
					value = 0;
				}
				case 4 -> {
					text = inputText();
					System.out.println(text);
					value = 0;
				}				
			}	
			
		} while (value != 5);
		
	}
	
	public static String sortParagraphByCountSentences(String text) { //сортировка текста кол-ву предложений в абзацах
		
		String[] paragraphs = text.split("(?<=\n)");    //разделение текста если символ перехода \n(абзац)        
		Arrays.sort(paragraphs, new lengthParagraphComporator()); 
		text = String.join("", paragraphs);		
		
		return text;		
	}
	
	public static String sortWordsInSentences(String text, String typeSort) { //сортировка слов в предложени по определённому условию
		
		String [] paragraphs = text.split("(?<=\n)");
		String[] words;
		String result = "";		

		for (int i = 0; i < paragraphs.length; i ++) { //проход по абзацам
			String[] sentence = paragraphs[i].split("(?<=[.?!])"); // разбивка по символам конца предложения
			for (int j = 0; j < sentence.length; j ++) { //проход по предложениям
				
				char charOfEnd = sentence[j].charAt(sentence[j].length() - 1); // запоминаем последний символ оканчивающий предложение
				sentence[j] = sentence[j].substring(0, sentence[j].length() - 1);
				sentence[j] = sentence[j].trim();
				words =	sentence[j].split(" |(, )"); //разбиение предложения на массив слов
				
				//Т.к. второе и третье условие схожи(сортируют слова в предложении), то дальше выбор как именно сортировать слова
				if (typeSort == "byLengthWords") { 
					Arrays.sort(words, new lengthWordsComporator()); //по длине слов в предложении
				} else if (typeSort == "byCountCharInWords") {
					Arrays.sort(words, new countCharInWordsComporator()); //по количеству вхождений символа в слово, а при равенстве - по алфавиту
				}	
				
				result += String.join(" ", words);	//складывание отсотрированных слов			
				if (j < sentence[j].length() -1) {
					result += charOfEnd + " "; //добавление символа(!.?) и space когда перебираемые слова из предложения закончились
				} else {
					result += charOfEnd; // а если конец абзаца, то без space
				}
			}
		}
		return result;
	}			
	
	public static String inputText() {

		String text = """
				Lomonosov was a scientist, a poet, a grammarian. He is often considered the first great Russian linguistic reformer. Lomonosov made substantial contribution to the natural sciences, reorganized the Saint Petersburg Imperial Academy of Sciences, established in Moscow the university that today bears his name, and created the first coloured glass mosaics in Russia.
				Lomonosov was born on the 19th of November, 1711 near Kholmogory, Russia. He was the son of a poor fisherman. At the age of 10 he took up that work, too. When the few books he was able to obtain could no longer satisfy his growing thirst for knowledge, he left his native village, penniless and on foot, for Moscow. He was 19. His ambition was to educate himself to join the learned men on whom the tsar Peter I the Great was calling to transform Russia into a modern nation.
				His bitter struggle began as soon as he arrived in Moscow! It was not an easy task for a man of humble origin to get education at that time. But his exceptional intelligence enabled him in five years to assimilate the eight-year course of study and in 1736 Lomonosov became a student at the Saint Petersburg Academy.
				Seven months later he left for Germany to study at the University of Marburg and later in Freiberg. He studied Western philosophy and science, the technologies of mining, metallurgy and glassmaking.
				""";
		return text;
	}
	
	public static class countCharInWordsComporator implements Comparator<String> { //сравнение слов по кол-ву вхождений введёного символа, иначе по алфавиту 
		@Override
		
		public int compare(String s1, String s2) {
			int count1 = 0;
			int count2 = 0;			
			
			for (int i = 0; i < s1.length(); i++) {  //определяются количества вхождений символа в обоих словах
				if (s1.charAt(i) == ch) {
					count1++;
				}
			}
			for (int i = 0; i < s2.length(); i++) {
				if (s2.charAt(i) == ch) {
					count2++;
				}
			}
			
			if (count1 > count2) {  //сравниване по количеству символов
				return -1;
			} else if (count1 < count2) {
				return 1;
			} else {                //если равны, то string natural order, т.е. по алфавиту 
				return s1.compareToIgnoreCase(s2);
			}	
		}
	}
	
	public static class lengthParagraphComporator implements Comparator<String> { //сравнение длины абзацев
		  @Override
		  
		  public int compare(String s1, String s2) { 
			  return s1.split("[!?.]").length - s2.split("[!?.]").length;
		  }
	  }
	
	public static class lengthWordsComporator implements Comparator<String> { //сравнение длины слов
		  @Override
		  
		  public int compare(String s1, String s2) {
			  return s1.length() - s2.length();
		  }
	  }

}