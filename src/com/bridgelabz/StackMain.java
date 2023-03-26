package com.bridgelabz;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack.peek()); // Output: 56
        System.out.println(stack.pop()); // Output: 56
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 70
        System.out.println(stack.isEmpty()); // Output: true

    }
}