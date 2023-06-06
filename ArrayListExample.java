package src.zadanie51;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Tworzenie obiektu ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Początkowy czas operacji
        long startTime = System.nanoTime();

        // Wypełnianie ArrayList liczbami parzystymi
        for (int i = 2; i <= 100; i += 2) {
            numbers.add(i);
        }

        // Aktualny czas operacji
        long endTime = System.nanoTime();

        // Wypisywanie wartości i indeksów
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println("Indeks: " + i + ", Wartość: " + number);
        }

        // Obliczanie i wypisywanie czasu operacji
        long duration = endTime - startTime;
        double seconds = (double) duration / 1_000_000_000.0;
        System.out.println("Czas całej operacji: " + seconds + " sekundy");
    }
}
