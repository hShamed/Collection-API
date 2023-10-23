package com.collections.set;

import com.collections.CollectionsAPI;

import java.util.*;

public class HS implements CollectionsAPI {
    private Set<Integer> hashSet;

    public HS() {
        this.hashSet = new HashSet<Integer>();
    }

    public HS(Set<Integer> hashSet) {
        this.hashSet = hashSet;
    }

    @Override
    public void addNumber(int number) {
        this.hashSet.add(number);
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
            this.hashSet.remove(number);
            System.out.println("Se eliminó: " + number);
        } else {
            System.out.println("No existe ese número");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.hashSet.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.hashSet.contains(number);
    }

    @Override
    public void clear() {
        this.hashSet.clear();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }

    public Set getHashSet() {
        return this.hashSet;
    }
}
