package com.bridgelabz;

import java.util.NoSuchElementException;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO STACK AND QUEUE PROBLEM");
        Queue myQueue = new Queue();

        myQueue.enqueue(56);
        myQueue.enqueue(30);
        myQueue.enqueue(70);

        while (!myQueue.isEmpty()) {
            int dequeuedValue = myQueue.dequeue();
            System.out.println(dequeuedValue);
        }
    }
}