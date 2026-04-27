package assignment8;

import assignment8.stack.Stack;


public abstract class Fixedstack implements Stack {
    private Employee[] stack;
    private int top;
    
    public Fixedstack(int size) {
        stack = new Employee[size];
        top = -1;
    }
    
   
    public void push(Employee emp) {
        if (top == stack.length - 1) {
             
            System.out.println("Stack Full: " + emp);
        } else {
            stack[++top] = emp;
        }
    }
    public Employee pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

