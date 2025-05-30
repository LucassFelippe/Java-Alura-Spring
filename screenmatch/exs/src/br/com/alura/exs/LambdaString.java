package br.com.alura.exs;

@FunctionalInterface
interface ConverteString{
     String converte(String s);

}

public class LambdaString {
    public static void main(String[] args) {
        ConverteString converte = s -> s.toUpperCase() ;
        System.out.println(converte.converte("lucas felippe")); // LUCAS FELIPPE
    }

}
