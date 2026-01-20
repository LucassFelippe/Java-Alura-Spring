package br.com.alura.exs.streams.esta;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamEsta {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> est = numeros.stream()
                    .max(Integer::compareTo);


        est.ifPresent(System.out::println);
    }
}
