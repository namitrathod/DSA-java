package StackandQueue;

public class stackmain {
    public static void main(String[] args) throws stackException {
        
        // customStack stack = new customStack(5);
        // stack.push(10);
        // stack.push(21);
        // stack.push(35);
        // stack.push(77);
        // stack.push(44);
        // stack.push(47);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // // System.out.println(stack.pop());  // for exception



        // DynamicStack stack = new DynamicStack(5);
        customStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(21);
        stack.push(35);
        stack.push(77);
        stack.push(44);
        stack.push(47);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());  // for exception
    }
}
