package br.com.alura.exs.streams.esta;

import java.util.Arrays;
import java.util.List;

public class SomaQuadrado {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n )
                .map(n -> n + n)
                .forEach(System.out::println);


    }
}
