package src.zadanie53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Coffee {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>();

        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");

        System.out.println();
        System.out.println("Nazwy kaw (a): ");
        System.out.println();
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }

        System.out.println();
        System.out.println("Nazwy kaw (b): ");
        System.out.println();
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Nazwy kaw (c): ");
        System.out.println();
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }

        System.out.println();
        System.out.println("Nazwy kaw (d): ");
        System.out.println();
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));
            }
        }
    }
}