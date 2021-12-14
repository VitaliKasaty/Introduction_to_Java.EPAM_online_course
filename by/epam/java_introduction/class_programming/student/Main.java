package by.epam.java_introduction.class_programming.student;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {
	
	public static void main(String[] args) {
		
		StudentOption studentOption = new StudentOption();		
		Student[] students = studentOption.createStudents();
		studentOption.printBestStudents(students);
		
	}

}
