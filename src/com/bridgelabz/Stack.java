package com.bridgelabz;
public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        this.list = new LinkedList<T>();
    }

    public void push(T data) {
        list.addFirst(data);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
