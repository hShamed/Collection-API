package com.collections.list;

import com.collections.CollectionsAPI;

import java.util.*;

public class LL implements CollectionsAPI {

    private LinkedList<Integer> linkedlist;

    public LL() {
        this.linkedlist = new LinkedList<Integer>();
    }

    public LL(LinkedList<Integer> linkedlist) {
        this.linkedlist = linkedlist;
    }

    @Override
    public void addNumber(int number) {
        this.linkedlist.add(number);
    }

    public void addFirstNumber(int number) {
        this.linkedlist.addFirst(number);
    }

    public void addLastNumber(int number) {
        this.linkedlist.addLast(number);
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
        try {
            this.linkedlist.remove(number);
            System.out.println("Se elimino");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    public void removeFirstNumber() {
        if (!isEmpty()) {
            this.linkedlist.removeFirst();
        } else {
            System.out.println("No hay elementos en su lista");
        }
    }

    public void removeLastNumber() {
        if (!isEmpty()) {
            this.linkedlist.removeLast();
        } else {
            System.out.println("No hay elementos en su lista");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.linkedlist.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.linkedlist.contains(number);
    }

    @Override
    public void clear() {
        this.linkedlist.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.linkedlist.isEmpty();
    }

    public void sort() {
        Collections.sort(this.linkedlist);
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.linkedlist.iterator();

        while (iterator.hasNext()) {
            System.out.print( iterator.next() + " / ");
        }

        System.out.println("\n");
    }
}
