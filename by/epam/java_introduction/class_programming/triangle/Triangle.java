package by.epam.java_introduction.class_programming.triangle;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class Triangle {
	
	private int a;  //a,b,c - длины сторон треугольника; x,y,z - координаты вершин труегольника
	private int b;
	private int c;
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private int z1;
	private int z2;	
	
	public Triangle(int a, int b, int c, int x1, int x2, int y1, int y2, int z1, int z2) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.z1 = z1;
		this.z2 = z2;
	}
	
	public double perimetrSquare() {
		
		return this.a + this.b + this.c; 
	}	
	
	public double squareTriangle() {
		
		double halfPerimetr = perimetrSquare() / 2;
		double square = Math.sqrt(halfPerimetr * (halfPerimetr - this.a) * (halfPerimetr - this.b) * (halfPerimetr - this.c));
		return square;
	}
	
	public double[] medianIntersectionPoint() { //вычисление координаты точки пересечения медиан
		
		double[] intersectionPoint = new double[2];
		intersectionPoint[0] = (double)(this.x1 + this.y1 + this.z1) / 3;
		intersectionPoint[1] = (double)(this.x2 + this.y2 + this.z2) / 3;		
		return intersectionPoint;
	}	

}
