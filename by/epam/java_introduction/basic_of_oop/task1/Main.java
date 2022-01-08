package by.epam.java_introduction.basic_of_oop.task1;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class Main {
	
	public static void main(String[] args) {
		
		View view = new View();
		Directory directory1 = new Directory("Test");
		Directory directory2 = new Directory();
		Directory directory3 = new Directory("Bingo");
		TextFile file1 = new TextFile("Weather", "Weather is good!");
		TextFile file2 = new TextFile("Auto", "BMW is Germany car.");		
		
		file1.addText("Really good.");
		view.printTextFile(file1);		
		
		directory1.addDirectory(directory2);
		directory1.addDirectory(directory3);
		directory1.addFile(file1);
		directory1.addFile(file2);				
		
		view.printContentDirectory(directory1);
		
		directory1.renameDirectory("Not Test");	
		directory1.deleteDirectory("Bingo");
		directory1.deleteFile("Weather");
		
		view.printContentDirectory(directory1);
		
	}

}
