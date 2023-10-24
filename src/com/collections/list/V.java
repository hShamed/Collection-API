package com.collections.list;

import com.collections.CollectionsAPI;

import java.util.*;

public class V implements CollectionsAPI {

    private Vector<Integer> vector;

    public V() {
        this.vector = new Vector<Integer>();
    }

    public V(int size) {
        this.vector = new Vector<Integer>(size);
    }

    public V(Vector<Integer> vector) {
        this.vector = vector;
    }

    @Override
    public void addNumber(int number) {
        this.vector.add(number);
    }

    public void addNumberInPosition(int index, int number) {
        try {
            this.vector.add(index, number);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó se desborda de la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
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
            this.vector.remove(number);
            System.out.println("Se elimino");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.vector.size());
    }

    public void capacityOf() {
        System.out.println("Capacidad: " + this.vector.capacity());
    }

    public void returnThis(int index) {
        try {
            System.out.println(this.vector.elementAt(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    @Override
    public boolean exitsThis(int number) {
        return this.vector.contains(number);
    }

    public void firstIndexOfThis(int number) {
        if (exitsThis(number)) {
            System.out.println("Su primer index es: " + this.vector.indexOf(number));
        } else {
            System.out.println("No existe ese número");
        }
    }

    @Override
    public void clear() {
        this.vector.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.vector.isEmpty();
    }

    public void sort() {
        Collections.sort(this.vector);
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.vector.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.println("\n");
    }
}
