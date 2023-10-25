package com.collections.set;

import com.collections.CollectionsAPI;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TS implements CollectionsAPI {

    private TreeSet<Integer> treeSet;

    public TS() {
        this.treeSet = new TreeSet<>();
    }

    public TS(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    @Override
    public void addNumber(int number) {
        this.treeSet.add(number);
    }

    @Override
    public void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        int limit = 0,
                number = 0;

        System.out.println("Cantidad de números a ingresar: ");

        try {
            limit = scanner.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Solo se aceptan número enteros");
        }

        for (int counter = 0; counter < limit; counter++) {
            System.out.println("Número: ");

            try {
                number = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Solo se aceptan número enteros");
                number = 0;
            }

            addNumber(number);
        }
    }

    @Override
    public void remove(int number) {
        if (exitsThis(number)) {
            this.treeSet.remove(number);
            System.out.println("Número eliminado: " + number);
        } else {
            System.out.println("No existe ese número");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.treeSet.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.treeSet.contains(number);
    }

    public void greaterOrEqual(int number) {
        System.out.println(this.treeSet.ceiling(number));
    }

    @Override
    public void clear() {
        this.treeSet.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.treeSet.isEmpty();
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }

    public void reverseIterator() {
        Iterator<Integer> iterator = this.treeSet.descendingIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }
}
