package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo;

import com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow.WorkflowManager;
import com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow.WorkflowManagerImpl1;
import com.an7one.example.effectivejava.ch07lambdasandstreams.item44.absoleteexample.templatepatterndemo.workflow.WorkflowManagerImpl2;

/**
 * Reference:
 * https://www.javacodegeeks.com/2013/05/template-method-pattern-using-lambda-expressions-default-methods.html
 */
public class App {
    public static void main(String[] args) {
        initializeWorkFlow(new WorkflowManagerImpl1());
        initializeWorkFlow(new WorkflowManagerImpl2());
    }

    private static void initializeWorkFlow(WorkflowManager workflowManager) {
        System.out.println("Starting the workflow... the old way");
        workflowManager.doTask1();
        workflowManager.doTask2();
        workflowManager.doTask3();
        workflowManager.doTask4();
    }
}
