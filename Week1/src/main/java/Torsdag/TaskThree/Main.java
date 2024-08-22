package Torsdag.TaskThree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = asList(7, 14, 21, 35, 41, 25, 23, 52);

        Predicate<Integer> isDividedBySeven = n -> n % 7 == 0;

        //Use Supplier to create a list of Employee objects based on a list of names like Arrays.asList("John", "Jane", "Jack", "Joe", "Jill")
        Supplier supplier = () -> new ArrayList<Employee>();

        Consumer consumer = x -> System.out.println(x);

        Function function;

        Predicate predicate2;

        System.out.println(filterNumbers(number, isDividedBySeven));


    }

    public static List<Integer> filterNumbers(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}