package Torsdag.TaskTwo;


import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MyTransformingType transform = (a) -> a / 2;

        MyValidatingType validate = (int a) -> {return a == 2; };
    }

    private static int[] map(int[] a, MyTransformingType op) {
        // Stream hvert integer, derefter transform og transform to array.
        return Arrays.stream(a).map(x -> op.transform(x)).toArray();
    }

    int[] filter(int[] a, MyValidatingType op) {
        return Arrays.stream(a).filter(x -> op.validate(x)).toArray();
    }
}