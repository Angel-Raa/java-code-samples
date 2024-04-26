package com.github.angel.lambdas;

import java.util.Iterator;

public class Collection<E> implements Iterable<E> {
    private E[] elements;
    private static final int DEFAULT_SIZE = 10;
    private int size;

    private void ensureCapacity() {
        if (this.elements == null) {
            this.elements = (E[]) new Object[DEFAULT_SIZE];
        } else if (this.size == elements.length) {
            E[] newElements = (E[]) new Object[size * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public Collection() {
        this(DEFAULT_SIZE);
    }

    public Collection(int capacity) {
        ensureCapacity();
        this.size = 0;
        this.elements = (E[]) new Object[capacity];
    }

    public void add(E element) {
        ensureCapacity();
        this.size++;
        this.elements[size] = element;
    }
    @Override
    public Iterator<E> iterator() {
        return new Itr<>();
    }


    private class Itr<E> implements Iterator<E> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new IndexOutOfBoundsException();
            }
            return (E) elements[cursor++];
        }
    }

    public int size() {
        return this.size;
    }

}
