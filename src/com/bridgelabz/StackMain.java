package com.bridgelabz;

import java.util.NoSuchElementException;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO STACK AND QUEUE PROBLEM");
        Stack myStack = new Stack();

        myStack.push(56);
        myStack.push(30);
        myStack.push(70);

        while (!myStack.isEmpty()) {
            try {
                int poppedValue = myStack.pop();
                System.out.println(poppedValue);
            } catch (NoSuchElementException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}