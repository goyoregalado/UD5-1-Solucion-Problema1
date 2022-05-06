package com.digitalcastaway.datastructures;

public class CustomCollection {
    private static final int DEFAULT_CAPACITY = 5;
    private Float []data = null;
    private int numValues = 0;

    public CustomCollection(int initialCapacity) {
        data = new Float[initialCapacity];
    }

    public CustomCollection() {
        data = new Float[DEFAULT_CAPACITY];
    }

    public Float getElement(int position) {
        return data[position];
    }

    public int getNumValues() {
        return numValues;
    }

    public void insert(Float element, int position) {
        if(numValues == data.length) {
            Float []aux = data;
            data = new Float[data.length * 2];
            for (int i = 0; i < aux.length; i++) {
                data[i] = aux[i];
            }
            aux = null;
        }

        for (int i = numValues - 1; i >= position ; i--) {
            data[i + 1] = data[i];
        }

        data[position] = element;
        numValues++;
    }

    public void add(Float element) {
        insert(element, numValues);
    }

    public int search(Float element) {
        for (int i = 0; i < numValues; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Float delete(int position) {
        Float aux = data[position];

        for (int i = position; i < numValues - 1; i++) {
            data[i] = data[i + 1];
        }
        data[numValues - 1] = null;
        numValues--;
        return aux;
    }

    @Override
    public String toString() {
        if(numValues == 0) {
            return "<Empty>";
        }
        String out = "";
        for (int i = 0; i < numValues; i++) {
            out += i + " - [" + data[i].toString() + "]\n";
        }
        return out;
    }
}
