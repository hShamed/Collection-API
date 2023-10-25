package com.collections.list;

import com.collections.CollectionsAPI;

import java.util.*;

public class S extends V implements CollectionsAPI {
    private Stack<Integer> stack;

    public S() {
        this.stack = new Stack<>();
    }

    public S(Stack<Integer> stack) {
        this.stack = stack;
    }

    public void pushNumber(int number) {
        this.stack.push(number);
    }

    public void searchThis(int number) {
        if (this.stack.search(number) != -1) {
            System.out.println("El número se encuentra en la posición: " + this.stack.search(number));
        } else {
            System.out.println("El número no existe");
        }
    }

    public void firstIndex() {
        if (!isEmpty()) {
            System.out.println("Su primer index es: " + this.stack.peek());
        } else {
            System.out.println("No existe ese número");
        }
    }

    public void firstIndexAndRemove() {
        if (!isEmpty()) {
            System.out.println("Su primer index era: " + this.stack.pop());
        } else {
            System.out.println("No existe ese número");
        }
    }
}
