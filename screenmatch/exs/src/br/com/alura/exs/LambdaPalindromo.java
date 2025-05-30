package br.com.alura.exs;

@FunctionalInterface
interface VerificaPalindromo{
    boolean verificarPalindromo(String str);
}

public class LambdaPalindromo {
    public static void main(String[] args) {
        VerificaPalindromo frase = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(frase.verificarPalindromo("radar")); // true
        System.out.println(frase.verificarPalindromo("java")); // false
    }
}
