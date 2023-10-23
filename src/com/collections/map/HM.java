package com.collections.map;

import com.collections.CollectionsAPI;

import java.util.*;

public class HM implements CollectionsAPI {
    private Map<String, Integer> hashMap;
    private String string;
    private int number;

    public HM() {
        this.hashMap = new HashMap<String, Integer>();
    }

    public HM(Map hashMap) {
        this.hashMap = hashMap;
    }

    public void addString(String string) {
        this.string = string;
    }

    @Override
    public void addNumber(int number) {
        this.number = number;
    }

    public void addKeyValue(String string, int number) {
        addString(string);
        addNumber(number);

        this.hashMap.put(this.string, this.number);
    }

    @Override
    public void addNumbers() {
        Scanner scannerInt = new Scanner(System.in),
                scannerString = new Scanner(System.in);


        int limit = 0,
                number = 0;

        String string = "";

        System.out.println("Cantidad de números a ingresar: ");

        try {
            limit = scannerInt.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Solo se aceptan número enteros");
        }

        for (int counter = 0; counter < limit; counter++) {
            System.out.println("Cadena: ");

            try {
                string = scannerString.nextLine();
            } catch (InputMismatchException i) {
                System.out.println("Solo se acepta cadena de texto");
                string = "";
            }

            System.out.println("Número: ");

            try {
                number = scannerInt.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Solo se aceptan número enteros");
                number = 0;
            }

            addKeyValue(string, number);
        }
    }

    @Override
    public void remove(int number) {
        if (exitsThis(number)) {
            String key = String.valueOf(this.hashMap.get(number));

            this.hashMap.remove(key);

            System.out.println("Se eliminó: " + number);
        } else {
            System.out.println("No existe ese valor");
        }
    }

    public void remove(String string) {
        if (exitsThis(string)) {

            this.hashMap.remove(string);

            System.out.println("Se eliminó: " + string);
        } else {
            System.out.println("No existe esa llave");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.hashMap.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.hashMap.containsValue(number);
    }

    public boolean exitsThis(String string) {
        return this.hashMap.containsKey(string);
    }

    @Override
    public void clear() {
        this.hashMap.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.hashMap.isEmpty();
    }

    @Override
    public void iterator() {
        Iterator<Map.Entry<String, Integer>> iterator = this.hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
