package br.com.alura.exs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);


        List<Integer> numerosMultiplicados = numeros.stream()
                .filter( n -> n % 2 == 1)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Numeros Originais: " + numeros);
        System.out.println("Numeros Impares multiplicados por 2: " + numerosMultiplicados);
    }
}
