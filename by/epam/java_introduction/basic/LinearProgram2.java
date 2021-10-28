package by.epam.java_introduction.basic;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class LinearProgram2 {

    public static void main(String[] args) {

        double a = 2.9;
        double b = 3.6;
        double c = 2.1;
        double result;

        result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result = " + result);

    }
}
