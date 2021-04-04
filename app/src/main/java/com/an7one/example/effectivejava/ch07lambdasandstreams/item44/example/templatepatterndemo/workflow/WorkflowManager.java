package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.example.templatepatterndemo.workflow;

/**
 * Reference:
 * https://www.javacodegeeks.com/2013/05/template-method-pattern-using-lambda-expressions-default-methods.html
 */
public interface WorkflowManager {
    default void doTask1() {
        System.out.println("Doing Task1...");
    }

    void doTask2();

    default void doTask3() {
        System.out.println("Doing Task3...");
    }

    default void doTask4() {
        System.out.println("Doing Task4...");
    }
}
