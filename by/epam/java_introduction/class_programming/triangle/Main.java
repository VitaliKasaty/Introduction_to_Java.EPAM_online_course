package by.epam.java_introduction.class_programming.triangle;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class Main {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(10, 10, 12, -4, -1, 6, 7, 10, 12);
		
		System.out.println("Периметр треугольника = " + triangle.perimetrSquare());
		System.out.println("Площадь треугольника = " + triangle.squareTriangle());	
		System.out.println("Точка пересечения медиан = [" + triangle.medianIntersectionPoint()[0]
							+ ", " + triangle.medianIntersectionPoint()[1] + "]");					
	}

}
