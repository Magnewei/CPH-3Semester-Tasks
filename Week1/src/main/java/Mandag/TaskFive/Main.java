package Mandag.TaskFive;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", LocalDate.of(1985, 5, 15)),
                new Employee(2, "Bob", LocalDate.of(1990, 3, 22)),
                new Employee(3, "Charlie", LocalDate.of(1982, 8, 10)),
                new Employee(4, "David", LocalDate.of(1975, 12, 1)),
                new Employee(5, "Eva", LocalDate.of(1988, 9, 5)),
                new Employee(6, "Frank", LocalDate.of(1992, 7, 19)),
                new Employee(7, "Grace", LocalDate.of(1983, 4, 25)),
                new Employee(8, "Henry", LocalDate.of(1995, 11, 30)),
                new Employee(9, "Ivy", LocalDate.of(1987, 1, 16)),
                new Employee(10, "Jack", LocalDate.of(1980, 2, 28))
        );

        employees.stream().map(employee -> {
            return LocalDate.now().minusYears(employee.getBirthdate().getYear());
        });

        employees.stream().map(employee -> employee.getBirthdate());

        employees.stream().map(employee -> employee.getName());
    }
}