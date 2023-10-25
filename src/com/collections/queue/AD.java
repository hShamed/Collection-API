package com.collections.queue;

import com.collections.CollectionsAPI;

import java.util.ArrayDeque;

public class AD extends PQ implements CollectionsAPI {
    private ArrayDeque<Integer> arrayDeque;

    public AD() {
        this.arrayDeque = new ArrayDeque<Integer>();
    }

    public AD(ArrayDeque<Integer> arrayDeque) {
        this.arrayDeque = arrayDeque;
    }

    public void addFirstNumber(int number) {
        this.arrayDeque.addFirst(number);
    }

    public void addLastNumber(int number) {
        this.arrayDeque.addLast(number);
    }

    public void removeFirstNumber() {
        this.arrayDeque.removeFirst();
    }

    public void removeLastNumber() {
        this.arrayDeque.removeLast();
    }
}
