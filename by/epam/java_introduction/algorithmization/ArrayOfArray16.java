package by.epam.java_introduction.algorithmization;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//...,n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:

import java.util.Scanner;

public class ArrayOfArray16 {

    public static void main(String[] args) {

        int n;
        int a[][];
        int b[][];

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        n = in.nextInt();
        a = new int[n][n];

         if (n % 2 == 1) {
            magicMatrixOdd(a, n, 1); // для нечётно магического квадрата
         } else if (n % 4 == 2) {
             b = new int[n / 2][n / 2]; //вспомогательная матрица b[][]
             magicMatrixEven(a, b, n / 2 ); // для чётно-нечётного магического квадрата
         } else {
             magicMatrixEvenOdd(a, n); // для чётно-чётного магического квадрата
         }

        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + a[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void magicMatrixOdd(int b[][], int n, int num) {

        int row = 0;
        int column = n / 2;
        int currentRow;
        int currentColumn;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                b[i][j] = 0;
            }
        }

        for (int i = 0; i < n * n; i++ ) {
            b[row][column] = num;
            num++;
            currentRow = row;
            currentColumn = column;
            row -= 1;
            column += 1;

            if (row == -1) {
                row = n - 1;
            }
            if (column > n - 1) {
                column = 0;
            }
            if (b[row][column] != 0) {
                row = currentRow + 1;
                column = currentColumn;
            }
        }
    }

    public static void magicMatrixEven(int a[][], int[][] b, int n) {
        int countNumbers;
        countNumbers = (int) Math.pow(n * 2, 2);  //Изначально пришло n/2, возводим его во вторую степень, чтобы узнать кол-во чисел в матрице
        int firstNumberInterval = 1; // начальное число интервала для заполнения вспомогательных матриц

        magicMatrixOdd(b, n , firstNumberInterval);
        for (int i = 0; i < n  ; i++) {
            for (int j = 0; j < n ; j++) {
                a[i][j] = b[i][j];
            }
        }

        firstNumberInterval = countNumbers / 4 + 1;
        magicMatrixOdd(b, n, firstNumberInterval);
        for (int i = n; i < n * 2; i++) {
            for (int j = n; j < n * 2; j++) {
                a[i][j] = b[i - n][j - n];
            }
        }

        firstNumberInterval = (countNumbers / 4) * 2 + 1;
        magicMatrixOdd(b, n  , firstNumberInterval);
        for (int i = 0; i < n; i++) {
            for (int j = n; j < n * 2; j++) {
                a[i][j] = b[i][j - n];
            }
        }

        firstNumberInterval = (countNumbers / 4) * 3 + 1;
        magicMatrixOdd(b, n, firstNumberInterval);
        for (int i = n; i < n * 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = b[i - n][j];
            }
        }

        int temp;
        int k = n / 2;
        //перестановка определённых элементов основной матрицы для получения магического квадрата
        for (int i = 0; i < n * 2; i++) {
            for (int j = 0; j < n * 2; j++) {

                if ((i == 0) && (j == 0)) {
                    temp = a[i][j];
                    a[i][j] = a[n][j];
                    a[n][j] = temp;
                }

                if ((i != 0) && (i < n - 1) && (j == 1)) {
                    temp = a[i][j];
                    a[i][j] = a[n + i][j];
                    a[n + i][j] = temp;
                }

                if ((i == n - 1) && (j == 0)) {
                    temp = a[i][j];
                    a[i][j] = a[n * 2 - 1][j];
                    a[n * 2 - 1][j] = temp;
                }

                 if ((i < n) && (j > n - k) && (j < n + k - 1)) {
                     temp = a[i][j];
                     a[i][j] = a[i + n][j];
                     a[i + n][j] = temp;
                 }
            }
        }

    }

    public static void magicMatrixEvenOdd (int a[][], int n) {

        int count = 1;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = count++;
            }
        }
        //матрица условно делится на 4 части и зеркально-диагонально меняются элементы в шахматном порядке
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                //в каждой проверке условия ниже выполняется одинаковый код, можно поместить его в один
                //большой-большой if, но тогда ревьюверу будет сложно разобраться
                if (j < n / 2) {
                    if ((i % 2 == 0) && (j % 2 == 1)) {
                        temp = a[i][j];
                        a[i][j] = a[n - i - 1][n - j - 1];
                        a[n - i - 1][n - j - 1] = temp;
                    } else if ((i % 2 == 1) && (j % 2 == 0)) {
                        temp = a[i][j];
                        a[i][j] = a[n - i - 1][n - j - 1];
                        a[n - i - 1][n - j - 1] = temp;
                    }
                } else {
                    if ((i % 2 == 0) && (j % 2 == 0)) {
                        temp = a[i][j];
                        a[i][j] = a[n - i - 1][n - j - 1];
                        a[n - i - 1][n - j - 1] = temp;
                    } else if ((i % 2 == 1) && (j % 2 == 1)) {
                        temp = a[i][j];
                        a[i][j] = a[n - i - 1][n - j - 1];
                        a[n - i - 1][n - j - 1] = temp;
                    }
                }
            }
        }

    }

}
