package by.epam.java_introduction.algorithmization;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class ArrayOfArray12 {

    public static void main(String[] args) {

        int a[][];
        int m = 5;
        int n = 5;
        int temp;
        a = new int[m][n];

        System.out.println("Сформированный массив: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        //сравниваем элемент со следующим и если > меняем их местами
        //возвращаем цикл на начало, снова сравниваем
        //цикл по строке закончится когда будет отсортировано по возрастанию
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i][j] > a[i][j + 1]) {
                    temp = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = temp;
                    j = -1;
                }
            }
        }

        System.out.println("Отсортированные строки по возрастанию значения элементов: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i][j] < a[i][j + 1]) {
                    temp = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = temp;
                    j = -1;
                }
            }
        }

        System.out.println("Отсортированные строки по уменьшению значения элементов: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }

    }
}
