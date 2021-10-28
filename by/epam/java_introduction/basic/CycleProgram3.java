package by.epam.java_introduction.basic;

//Найти сумму квадратов первых ста чисел

public class CycleProgram3 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("Сумма квадратов первых ста чисел = " + sum);
    }
}
