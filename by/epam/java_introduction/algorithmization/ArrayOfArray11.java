package by.epam.java_introduction.algorithmization;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class ArrayOfArray11 {

    public static void main(String[] args) {

        int a[][] = new int[10][20];
        int count = 0;

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = (int) (Math.random() * 16) ;
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Строки, где 5 встречается 3 и более раз: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (a[i][j] == 5) count++;
            }
            if (count >= 3) {
                System.out.print((i - 1) + " ");
            }
            count = 0;
        }

    }
}
