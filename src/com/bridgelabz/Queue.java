package com.bridgelabz;

import java.util.NoSuchElementException;

public class Queue {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<Integer>();
    }

    public void enqueue(int value) {
        queue.addLast(value);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

