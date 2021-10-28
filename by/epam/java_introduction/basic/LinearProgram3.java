package by.epam.java_introduction.basic;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class LinearProgram3 {

    public static void main(String[] args) {

        double x = 2.9;
        double y = 3.6;
        double result;

        result = ((Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y) ;
        System.out.println("Result = " + result);

    }
}