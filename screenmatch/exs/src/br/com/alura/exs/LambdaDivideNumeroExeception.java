package br.com.alura.exs;

@FunctionalInterface
interface Divide{
    int numeros(int a, int b) throws ArithmeticException;
}
public class LambdaDivideNumeroExeception {
    public static void main(String[] args) {
        Divide numeros = (a, b) ->  {
            if (b == 0){
                throw new ArithmeticException("Erro na divisão");
            }
            return a/b;
        };
        try{
            System.out.println(numeros.numeros(10,2)); // esperado 5
            System.out.println(numeros.numeros(10,0)); // esperado 0
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
