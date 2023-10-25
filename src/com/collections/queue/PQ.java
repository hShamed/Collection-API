package com.collections.queue;

import com.collections.CollectionsAPI;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PQ implements CollectionsAPI {
    private PriorityQueue<Integer> priorityQueue;

    public PQ() {
        this.priorityQueue = new PriorityQueue<Integer>();
    }

    public PQ(PriorityQueue<Integer> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    @Override
    public void addNumber(int number) {
        this.priorityQueue.add(number);
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
            this.priorityQueue.remove(number);
            System.out.println("Número eliminado: " + number);
        } else {
            System.out.println("No existe ese número");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.priorityQueue.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.priorityQueue.contains(number);
    }

    @Override
    public void clear() {
        this.priorityQueue.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.priorityQueue.isEmpty();
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.priorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }
}
