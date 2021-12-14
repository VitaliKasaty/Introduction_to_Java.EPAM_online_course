package by.epam.java_introduction.class_programming.student;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class StudentOption {
	
	public Student[] createStudents() {
		
		Student[] students = {
				new Student("Косатый", 10, new int[] {9, 10, 10, 10, 9}),
				new Student("Иванов", 12, new int[] {5, 10, 3, 10, 9}),
				new Student("Сидоров", 7, new int[] {9, 4, 10, 10, 6}),
				new Student("Джураев", 2, new int[] {8, 10, 7, 10, 9}),
				new Student("Алексин", 10, new int[] {9, 9, 9, 9, 9}),
				new Student("Путин", 10, new int[] {4, 4, 4, 4, 4}),
				new Student("Морозов", 8, new int[] {10, 10, 10, 10, 10}),
				new Student("Прашкович", 1, new int[] {5, 10, 6, 10, 9}),
				new Student("Минов", 10, new int[] {9, 10, 6, 10, 7}),
				new Student("Филинов", 10, new int[] {4, 5, 6, 7, 9}),
		};
		
		return students;
	}
	
	public void printBestStudents(Student[] students) {	
		
		for(Student student : students) {
			boolean best = true;			
			for (int mark : student.getPerformance()) {
				
				if (mark <9) {
					best = false;
					break;
				}
			}
			if(best) {
				System.out.println(student.getSurName() + ", группа №" + student.getGroup());
			}			
		}
		
	}

}
