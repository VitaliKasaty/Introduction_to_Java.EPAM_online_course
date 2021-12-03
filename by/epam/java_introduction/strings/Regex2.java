package by.epam.java_introduction.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Дана строка, содержащая следующий текст (xml-документ).
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.*/

public class Regex2 {
	
	public static void main(String[] args) {
		
		String xmlDoc = "<notes>\n" +		
				        "<note id = \"1\">\n" +
				        "<to>Вася</to>\n" +
				        "<from>Света</from>\n" +
				        "<heading>Напоминание</heading>\n" +
				        "<body>Позвони мне завтра!</body>\n" +
				        "</note>\n" +
				        "<note id = \"2\">\n" +
				        "<to>Петя</to>\n" +
				        "<from>Маша</from>\n" +
				        "<heading>Важное напоминание</heading>\n" +
				        "</body>\n" +
				        "</note>\n" +
				        "</notes>\n";
		
		System.out.println(xmlDoc);
		Pattern pattern = Pattern.compile("((?<fullTag>(?<open><\\w+>)+(?<body>.+)+(?<close></\\w+>))" +
										  "|(?<openTag><[^/].+>)|" +
										  "(?<closeTag></\\w+>))");
		Matcher matcher = pattern.matcher(xmlDoc);
		
		//Описание групп захвата:
		//"fullTag" ищет полный тег, например <to>Вася</to> , где "open" это <to> , "body" - Вася , "close" - </to>
		//"openTag" ищет только открывающий тег в строке, соответственно он без тела, например <notes>
		//"closeTag" только закрывающий тег в строке, например </notes>	
				
		while (matcher.find()) {
					
			if (matcher.group("openTag") != null) {
				System.out.println("Открывающий тег без тела: " + matcher.group("openTag"));
			} else if (matcher.group("closeTag") != null) {
				System.out.println("Закрывающий тег без тела: " + matcher.group("closeTag"));
			} else 	if (matcher.group("fullTag") != null) {
				System.out.println("Открывающий тег: " + matcher.group("open"));
				System.out.println("Содержимое тега: " + matcher.group("body"));
				System.out.println("Закрывающий тег: " + matcher.group("close"));
			}
		}
	}

}
