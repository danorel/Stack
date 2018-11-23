package com.stackImp;


public class Stack {
    // Variables
    public int Size = 0;
    private int MaxGeneratedSize = 10;
    private int MinGeneratedSize = 1;
    private Object[] stack;
    private int apex = 0;
    private static int stackCounter = 0;
    // Class constructors
    /*
        Constructor without parameters.
        Defining Size of Stack = 5;
     */
    public Stack(){
        System.out.println("Creating the stack with using constructor without any parameters.");
        Size = (int)(Math.random() * MaxGeneratedSize) + MinGeneratedSize;
        System.out.println("Defining the random size of stack from [" + MinGeneratedSize + "," + MaxGeneratedSize + "]..." + Size);
        stack = new Object[Size];
        stackCounter++;
    }
    /*
        Constructor with parameter Size,
        which defines the max size of the stack.
     */
    public Stack(int Size){
        System.out.println("Creating the stack with using constructor with Size parameter.");
        if(Size < 0){
            this.Size = (int)(Math.random() * MaxGeneratedSize) + MinGeneratedSize;
            System.out.println("Negative Array Size Exception! Re-defining the Size randomly from [" + MinGeneratedSize + "," + MaxGeneratedSize + "]..." + this.Size);
        } else {
            this.Size = Size;
        }
        stack = new Object[this.Size];
        stackCounter++;
    }

    // Methods
    /*
        Push the element into the apex of the stack.
     */
    public void push(Object element){
        if(apex < Size){
            stack[apex++] = element;
        } else {
            System.out.println("The stack is full. Empty this" +
                    " before adding new elements!");
        }
    }
    /*
        Pop the element from the apex of the stack.
    */
    public Object pop(){
        if(apex < 0){
            System.out.println("Nothing to pop. Try this" +
                    " operation after adding new elements!");
            return -1;
        } else {
            Object apexElem = stack[--apex];
            return apexElem;
        }
    }
    /*
        Method showStack show the stack in the current moment.
    */
    public void showStack(){
        if(!isEmpty()){
            for(int counter = 0; counter < apex; counter++){
                System.out.print(stack[counter] + "->");
            }
            System.out.println("null");
        } else {
            System.out.print("Can not implement this operation. Stack" +
                    " is empty!");
        }
    }
    /*
        Method checks if the stack is full and returns boolean.
    */
    public boolean isEmpty(){
        if(apex == 0){
            return true;
        } else {
            return false;
        }
    }

    public int getStackCounter(){
        return stackCounter;
    }

    @Override
    public String toString() {
        return "The apex index of stack is " + Integer.toString(apex);
    }
}
