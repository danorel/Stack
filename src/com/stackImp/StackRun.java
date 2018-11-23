package com.stackImp;

import java.util.ArrayList;

public class StackRun {
    private int testSize = -1;

    public static void main(String[] args){
        new StackRun().run();
    }

    public void run(){
        /*
        Testing constructor with parameter testSize
         */
        Stack stackWithParameters = new Stack(testSize);
        for(int i = 0; i < stackWithParameters.Size; i++){
            if(i % 2 != 1){
                stackWithParameters.push(i);
            }
        }
        System.out.println(stackWithParameters);
        while(!stackWithParameters.isEmpty()){
            stackWithParameters.showStack();
            stackWithParameters.pop();
        }
        System.out.println(stackWithParameters);
        System.out.println("Summary count of implemented stacks: " + stackWithParameters.getStackCounter());
        borderStatements();
        /*
        Testing constructor without any parameters
         */
        Stack stackWithoutParameters = new Stack();
        for(int i = 0; i <= stackWithoutParameters.Size; i++){
            if(i % 2 != 1){
                stackWithoutParameters.push(i);
            }
        }
        System.out.println(stackWithoutParameters);
        while(!stackWithoutParameters.isEmpty()){
            stackWithoutParameters.showStack();
            stackWithoutParameters.pop();
        }
        System.out.println(stackWithoutParameters);
        System.out.println("Summary count of implemented stacks: " + stackWithoutParameters.getStackCounter());
    }

    private void borderStatements() {
        System.out.println("------------------------------------------------------------------");
    }
}
