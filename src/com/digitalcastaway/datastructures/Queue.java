package com.digitalcastaway.datastructures;

public class Queue {
    private final static int INITIAL_CAPACITY = 5;


    private CustomCollection collection = new CustomCollection(INITIAL_CAPACITY);

    public void enqueue(Float value) {
        collection.add(value);
    }

    public Float dequeue() {
        return collection.delete(0);
    }

    public int getQuantity() {
        return collection.getNumValues();
    }
}
