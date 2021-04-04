/**
 * Reference:
 * https://www.javacodegeeks.com/2013/05/template-method-pattern-using-lambda-expressions-default-methods.html
 */
package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow;

public abstract class WorkflowManager {
    public void doTask1() {
        System.out.println("Doing task 1...");
    }

    public abstract void doTask2();

    public abstract void doTask3();

    public void doTask4() {
        System.out.println("Doing task 4...");
    }
}
