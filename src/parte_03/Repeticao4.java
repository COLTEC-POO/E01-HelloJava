package parte_03;

public class Repeticao4 {

    public static void main(String[] args) {
        int numero = 12;
        long fatorial = 1;

        // Calculando o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        // Imprimindo o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

}
