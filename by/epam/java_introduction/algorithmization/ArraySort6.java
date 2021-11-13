package by.epam.java_introduction.algorithmization;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, 
//то продвигаются на один элемент вперед. Если ai >= ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class ArraySort6 {
	
	public static void main(String[] args) {
		
		double a[];		
		double temp;
		int n = 10;
		a = new double[n];
		
		System.out.println("Случайный массив:");
        for (int i = 0; i < n; i++) {            
        	a[i] = (double) ((int) (Math.random() * 1000)) / 10  ;
        	System.out.print("[" + a[i] + "] ");
        }
        
        for (int step = n / 2; step > 0; step /= 2) {
        	for (int i = step; i < n; i++) {
        		for (int j = i - step; j >= 0 && a[j] > a[j + step]; j -= step) {
					temp = a[j];
					a[j] = a[j + step];
					a[j + step] = temp;
				}				
			}			
		}
        	
		System.out.println("\nОтсортирован алгоритмом Шелла:");
        for (int i = 0; i < n; i++) {            
        	System.out.print("[" + a[i] + "] ");
        } 	     	
        	
	}     

}


