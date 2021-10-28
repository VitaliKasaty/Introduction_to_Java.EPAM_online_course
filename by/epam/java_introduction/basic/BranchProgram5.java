package by.epam.java_introduction.basic;

//Вычислить значение функции:

public class BranchProgram5 {

    public static void main(String[] args) {

        double x = 4;
        double result;

        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        }
        else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);

    }
}
