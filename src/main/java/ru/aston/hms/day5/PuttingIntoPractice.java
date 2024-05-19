package ru.aston.hms.day5;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("ex1:");
        transactions.
                stream().
                filter(x -> x.getYear() == 2011)
                .sorted((o1, o2) -> o1.getYear() - o2.getYear())
                .forEach(System.out::println);
        System.out.println("ex2:");
        List<String> uniqueCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();
        uniqueCities.forEach(System.out::println);
        System.out.println("ex3:");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .forEach(System.out::println);
        System.out.println("ex4:");
        String ex4Value = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(ex4Value);
        System.out.println("ex5:");
        boolean answer = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(answer);
        System.out.println("ex6");
        System.out.println("sum: " +
                transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum)
                .orElse(0));
        System.out.println("ex7");
        System.out.println("maxValue -> " +
                transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare).get());
        System.out.println("ex8");
        System.out.println(
                transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare).get());
    }
}