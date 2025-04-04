package fr.anthonyquere.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> startFizzBuzz(int count) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Exécution avec un exemple
        int count = 20; // Nombre d'éléments
        List<String> output = startFizzBuzz(count);

        // Affichage des résultats
        output.forEach(System.out::println);
    }
}
