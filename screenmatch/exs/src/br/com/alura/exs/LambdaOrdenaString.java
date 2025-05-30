package br.com.alura.exs;

import java.util.Arrays;
import java.util.List;

public class LambdaOrdenaString {
    public static void main(String[] args) {
        List<String> nomes =  Arrays.asList("Lucas","Ana","Jõao","Fernanda","Lucio","Laura");
        nomes.sort((a,b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}
