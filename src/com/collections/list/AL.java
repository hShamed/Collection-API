package com.list;

import java.util.*;

public class AL implements CollectionsAPI{
    private List<Integer> arrayList;

    public AL() {
        this.arrayList = new ArrayList<Integer>();
    }

    public AL(ArrayList<Integer> arrayList) {
        this.arrayList = (ArrayList<Integer>) arrayList.clone();
    }

    public void addNumber(int number) {
        this.arrayList.add(number);
    }

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

    public void addNumberInPosition(int index, int number) {
        try {
            this.arrayList.add(index, number);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó se desborda de la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    public void sizeOf() {
        System.out.println("Tamaño: " + arrayList.size());
    }

    public void returnThis(int index) {
        try {
            System.out.println(this.arrayList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    public boolean exitsThis(int number) {
       return this.arrayList.contains(number);
    }

    public void firstIndexOfThis(int number) {
        if (exitsThis(number)) {
            System.out.println("Su primer index es: " + this.arrayList.indexOf(number));
        } else {
            System.out.println("No existe ese número");
        }
    }

    public void lastIndexOfThis(int number) {
        if (exitsThis(number)) {
            System.out.println("Su último index es: " + this.arrayList.lastIndexOf(number));
        } else {
            System.out.println("No existe ese número");
        }
    }

    public void removeInThisIndex(int index) {
        try {
            this.arrayList.remove(index);
            System.out.println("Se elimino");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El index que marcó no existe en la lista: \n" + e.getMessage() + "");
        } catch (Exception e) {
            System.out.println("¡Ocurrió un error: " + e.getMessage() + "!");
        }
    }

    public void clear() {
        this.arrayList.clear();

        System.out.println("Limpieza");
    }

    public boolean isEmpty() {
        return this.arrayList.isEmpty();
    }

    public void sort() {
        Collections.sort(this.arrayList);
    }

    public void iterator() {
        Iterator<Integer> iterator = this.arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " / ");
        }

        System.out.print("\n");
    }

    public List getArrayList() {
        return this.arrayList;
    }
}
