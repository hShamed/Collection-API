package com.collections.map;

import com.collections.CollectionsAPI;
import com.collections.list.S;

import java.util.*;

public class TM implements CollectionsAPI {
    private TreeMap<String,Integer> treeMap;
    private String string;
    private int number;

    public TM() {
        this.treeMap = new TreeMap<String, Integer>();
    }

    public TM(TreeMap<String, Integer> treeMap) {
        this.treeMap = treeMap;
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

        this.treeMap.put(this.string, this.number);
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
            String key = String.valueOf(this.treeMap.get(number));

            this.treeMap.remove(key);

            System.out.println("Se eliminó: " + number);
        } else {
            System.out.println("No existe ese valor");
        }
    }

    public void remove(String string) {
        if (exitsThis(string)) {

            this.treeMap.remove(string);

            System.out.println("Se eliminó: " + string);
        } else {
            System.out.println("No existe esa llave");
        }
    }

    @Override
    public void sizeOf() {
        System.out.println("Tamaño: " + this.treeMap.size());
    }

    @Override
    public boolean exitsThis(int number) {
        return this.treeMap.containsValue(number);
    }

    public boolean exitsThis(String string) {
        return this.treeMap.containsKey(string);
    }

    @Override
    public void clear() {
        this.treeMap.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.treeMap.isEmpty();
    }

    @Override
    public void iterator() {
        Iterator<Map.Entry<String, Integer>> iterator = this.treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
