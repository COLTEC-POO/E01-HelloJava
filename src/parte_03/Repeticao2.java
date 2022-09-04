package parte_03;

public class Repeticao2 {
    public static void main(String[] args){
        int i, soma = 0;
        int valorInicial = 100, valorFinal = 1000;

        System.out.println("Imprimindo a soma de valores entre 100 - 1000");

        for (i = valorInicial; i <= valorFinal; i++){
            soma += i;
        }

        System.out.printf("%s%d", "A soma dos valores é: ", soma);
    }
}
