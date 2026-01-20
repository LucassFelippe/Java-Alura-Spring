package br.com.alura.exs.streams;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sublistas {

    private static boolean ehPrimo(int nummero){
        if (nummero < 2) return false;
        for (int i = 2; i <= Math.sqrt(nummero); i++){
            if (nummero % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> listaUnica = listaDeNumeros.stream()
                .flatMap(integers -> integers.stream())
                .filter(Sublistas::ehPrimo)
                .collect(Collectors.toList());

        System.out.println(listaUnica);
    }
}
