package com.bridgelabz;

import java.util.NoSuchElementException;

public class Stack {

    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<Integer>();
    }

    public void push(int value) {
        stack.addFirst(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}