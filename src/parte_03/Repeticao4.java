import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = entrada.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}