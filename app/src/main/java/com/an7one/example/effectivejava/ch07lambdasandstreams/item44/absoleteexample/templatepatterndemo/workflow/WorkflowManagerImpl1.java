/**
 * Reference:
 * https://www.javacodegeeks.com/2013/05/template-method-pattern-using-lambda-expressions-default-methods.html
 */
package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow;

public class WorkflowManagerImpl1 extends WorkflowManager {
    @Override
    public void doTask2() {
        System.out.println("Doing Task2 from WorkflowManager1...");
    }

    @Override
    public void doTask3() {
        System.out.println("Doing Task3 from WorkflowManager1...");
    }
}
