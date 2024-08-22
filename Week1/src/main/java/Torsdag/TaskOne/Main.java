package Torsdag.TaskOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArithmeticOperation addition = (a, b) -> a + b;

        ArithmeticOperation subtraction = (a, b) -> a - b;

        ArithmeticOperation multiplication = (a, b) -> a * b;

        ArithmeticOperation division = (a, b) -> a / b;

        ArithmeticOperation modulus = (a, b) -> a % b;

        ArithmeticOperation power = (a, b) -> a ^ b;

        int operation = operate(2, 3, addition);
        //System.out.println(operation);


        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        int[] result = operate(a, b, addition);
       Arrays.stream(result).forEach(number -> System.out.println(number));



    }

    private static int operate(int a, int b, ArithmeticOperation op) {
        return op.perform(a, b);
    }


    private static int[] operate(int[] a, int[] b, ArithmeticOperation op) {
        return Arrays.stream(a).
                map(i -> op.perform(i, b[i-1])).toArray();
    }




}