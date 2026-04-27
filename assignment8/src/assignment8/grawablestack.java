package assignment8;

import assignment8.stack.Stack;

public abstract class grawablestack implements Stack{
	
	private Employee[] stack;
    private int top;
    
    public  grawablestack(int size) {
        stack = new Employee[size];
        top = -1;
    }
    
   
    public void push(Employee emp) {
    	if (top == stack.length - 1) {
    		Employee[] newStack = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = emp;
    		
    		
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
	
	


