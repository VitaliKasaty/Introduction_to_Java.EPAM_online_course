package by.epam.java_introduction.basic;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class LinearProgram4 {

    public static void main(String[] args) {

        double r = 765.389;
        double result;

        result = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println("Result = " + result);

    }
}