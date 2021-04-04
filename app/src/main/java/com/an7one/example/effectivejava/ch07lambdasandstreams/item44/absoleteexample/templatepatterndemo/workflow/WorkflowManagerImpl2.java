package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow;

/**
 * Reference:
 * https://www.javacodegeeks.com/2013/05/template-method-pattern-using-lambda-expressions-default-methods.html
 */
public class WorkflowManagerImpl2 extends WorkflowManager {
    @Override
    public void doTask2() {
        System.out.println("Doing Task2 from WorkflowManager2...");
    }

    @Override
    public void doTask3() {
        System.out.println("Doing Task3 from WorkflowManager2...");
    }
}
