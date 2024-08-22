package Mandag.TaskTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
/*
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 150.00, "USD"),
                new Transaction(2, 200.00, "EUR"),
                new Transaction(3, 250.50, "GBP"),
                new Transaction(4, 300.75, "JPY"),
                new Transaction(5, 125.25, "USD"),
                new Transaction(6, 500.00, "EUR"),
                new Transaction(7, 600.00, "GBP"),
                new Transaction(8, 700.00, "JPY"),
                new Transaction(9, 800.00, "USD"),
                new Transaction(10, 900.00, "EUR")
        );

 */

        /*
        double totalTransactionAmount = transactions.stream().mapToDouble(Transaction::getAmount).sum();

        Map<String, Double> amountByCurrency = transactions.stream().collect(Collectors.toMap(Transaction::getCurrency, Transaction::getAmount, Double::sum));

        double highestTransaction = transactions.stream().max(Comparator.comparing(Transaction::getAmount)).map(Transaction::getAmount).orElseThrow();

        double avgTransactionAmount = transactions.stream().mapToDouble(Transaction::getAmount).sum() / transactions.size();

         */
    }
}