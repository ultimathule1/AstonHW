package ru.aston.hms.day7.concurrency.forkjoin;


import ru.aston.hms.day7.concurrency.forkjoin.model.DivideNumberAction;

import java.util.concurrent.ForkJoinPool;

public class DivideNumberDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        DivideNumberAction divideNumberAction = new DivideNumberAction(1000);
        forkJoinPool.invoke(divideNumberAction);
    }
}
