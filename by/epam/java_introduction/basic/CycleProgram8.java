package by.epam.java_introduction.basic;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class CycleProgram8 {

    public static void main(String[] args) {

        int num1 = 4580129;
        int num2 = 6290371;
        int checkNum1;
        int testNum2 = num2;

        while (num1 > 0) {
            checkNum1 = num1 % 10;
            num1 /= 10;

            while (testNum2 > 0 ) {
                if ((testNum2 % 10) == checkNum1) {
                    System.out.println("Цифра " + checkNum1 + " входит в запись первого и второго числа");
                }
                testNum2 /= 10;
            }
            testNum2 = num2;
        }

    }
}
