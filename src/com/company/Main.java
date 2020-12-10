package com.company;

public class Main {
    public static void main (String[] args) {
        NodeBasedStack<Integer> stack = new NodeBasedStack<Integer>();
        stack.push(1);
        stack.push(7);
        stack.push(9);
        stack.push(98);
        stack.push(-50);

        System.out.println("After push, size of the stack: " + stack.size());
        System.out.println("Top is: " + stack.peek());

        System.out.println("*** Testing pop ***");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println("After pop, size of the stack: " + stack.size());
    }
}
