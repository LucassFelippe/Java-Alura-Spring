package br.com.alura.exs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numeros.replaceAll(n -> n*3);
        System.out.println(numeros);
    }
}
