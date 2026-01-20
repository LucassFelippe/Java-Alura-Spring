package br.com.alura.exs.streams;

import java.util.Arrays;
import java.util.List;

public class ConverterMaisuculas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "stream", "lambda");

        palavras.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
