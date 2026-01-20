package br.com.alura.exs.streams.esta;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> numerospares = numeros.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + numerospares.get(true));
        System.out.println("Impares: " + numerospares.get(false));
    }
}
