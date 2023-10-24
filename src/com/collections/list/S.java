package com.collections.list;

import com.collections.CollectionsAPI;

import java.util.*;

public class S implements CollectionsAPI {
    private Stack<Integer> stack;

    public S() {
        this.stack = new Stack<>();
    }

    public S(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void addNumber(int number) {
        this.stack.add(number);
    }

    public void pushNumber(int number) {
        this.stack.push(number);
    }

    public void addNumberInPosition(int index, int number) {
        try {
            this.stack.add(index, number);
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
            this.stack.remove(number);
            System.out.println("Se elimino");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.stack.size());
    }

    public void capacityOf() {
        System.out.println("Capacidad: " + this.stack.capacity());
    }

    public void returnThis(int index) {
        try {
            System.out.println(this.stack.elementAt(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    @Override
    public boolean exitsThis(int number) {
        return this.stack.contains(number);
    }

    public void searchThis(int number) {
        if (this.stack.search(number) != -1) {
            System.out.println("El número se encuentra en la posición: " + this.stack.search(number));
        } else {
            System.out.println("El número no existe");
        }
    }

    public void firstIndexOfThis(int number) {
        if (exitsThis(number)) {
            System.out.println("Su primer index es: " + this.stack.indexOf(number));
        } else {
            System.out.println("No existe ese número");
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

    @Override
    public void clear() {
        this.stack.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.empty();
    }

    public void sort() {
        Collections.sort(this.stack);
    }

    @Override
    public void iterator() {
        Iterator<Integer> iterator = this.stack.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.println("\n");
    }
}
