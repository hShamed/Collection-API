package com.collections.set;

import com.collections.CollectionsAPI;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LHS implements CollectionsAPI {

    private LinkedHashSet<Integer> linkedHashSet;

    public LHS() {
        this.linkedHashSet = new LinkedHashSet<>();
    }

    public LHS(int size) {
        this.linkedHashSet = new LinkedHashSet<>(size);
    }

    public LHS(LinkedHashSet<Integer> linkedHashSet) {
        this.linkedHashSet = linkedHashSet;
    }

    @Override
    public void addNumber(int number) {
        this.linkedHashSet.add(number);
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
            this.linkedHashSet.remove(number);
            System.out.println("Se eliminó: " + number);
        } else {
            System.out.println("No existe ese número");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.linkedHashSet.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.linkedHashSet.contains(number);
    }

    @Override
    public void clear() {
        this.linkedHashSet.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.linkedHashSet.isEmpty();
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.linkedHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }
}
