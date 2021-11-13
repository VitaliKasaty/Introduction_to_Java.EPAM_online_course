package by.epam.java_introduction.algorithmization;

//Даны натуральные дроби p1/q1, p2/q1 ... pn/qn. Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

public class ArraySort8 {

	public static void main(String[] args) {
		
		int p[];
		int q[];
		int n = 10;
		int nokFull = 1;
		int temp;
		
		p = new int[n];
		q = new int[n];
		
		for (int i = 0; i < n; i++) {
			p[i] = (int) (Math.random() * 10) + 1;
			q[i] = (int) (Math.random() * 10) + 1;  
		}
		
		System.out.println("Сформированные дроби:");
		for (int i = 0; i < n; i++) {			
			System.out.print(p[i] + "/" + q[i] +"  ");
		}
		
		for (int i = 0; i < n; i++) {         //Нахождениe общего НОК знаменателей
			nokFull = nok(nokFull, q[i]);		
		}
		
		for (int i = 0; i < n; i++) {        //Приведение дробей 
			p[i] = (nokFull / q[i]) * p[i]; 
			q[i] = nokFull;
		}
				
		for (int i = 0; i < n - 1; i++) {    //Сортировка числителей по возрастанию
            if (p[i] > p[i + 1]) {
                temp = p[i];
                p[i] = p[i + 1];
                p[i + 1] = temp;
                i = -1;
            }
        }

		System.out.println("\nОтсортированно по возрастанию:");
		for (int i = 0; i < n; i++) {			
			System.out.print(p[i] + "/" + q[i] +"  ");
		}

	}
	
	public static int nod(int a, int b) {   //метод нахождения НОД
		
		while(a != 0 && b != 0) {			
			if (a >= b) { 
				a = a % b;
			} 
			else if (b > a){
				b = b % a;
			}			
		}		
		return a + b;
	}
	
	public static int nok(int a, int b) {   //метод нахождения НОК
		int res;
		
		res = (a * b) / nod(a, b);
		return res;
	}
	
}
