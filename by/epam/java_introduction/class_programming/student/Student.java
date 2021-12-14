package by.epam.java_introduction.class_programming.student;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {
	
	private String surName;
	private int group;
	private int[] performance = new int[5];
	
	public Student(String surName, int group, int[] performance) {
		this.surName = surName;
		this.group = group;
		this.performance = performance;
	}	
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int[] getPerformance() {
		return performance;
	}
	public void setPerformance(int[] performance) {
		this.performance = performance;
	}		

}
