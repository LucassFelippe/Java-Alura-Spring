package br.com.alura.exs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicata {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        List<String> palavrasUnicas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Lista completa" + palavras);
        System.out.println(palavrasUnicas);
    }
}
