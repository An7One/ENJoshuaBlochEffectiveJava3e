package com.an7one.example.effectivejava.ch07lambdasandstreams.item44.example.templatepatterndemo;

import com.an7one.example.effectivejava.ch07lambdasandstreams.item44.example.templatepatterndemo.workflow.WorkflowManager;

public class App {
    public static void main(String[] args) {
        initializeWorkFlow(() -> System.out.println("Doing Task2, with manager 1, with lambda expressions..."));
        initializeWorkFlow(() -> System.out.println("Doing Task2, with manager 2,  with lambda expressions..."));
        initializeWorkFlow(() -> System.out.println("Doing Task2, with manager 3,  with lambda expressions..."));
    }

    private static void initializeWorkFlow(WorkflowManager workflowManager) {
        System.out.println("Starting the workflow...");
        workflowManager.doTask1();
        workflowManager.doTask2();
        workflowManager.doTask3();
        workflowManager.doTask4();
    }
}
