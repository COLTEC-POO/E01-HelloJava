package parte_03;

import java.util.Scanner;
public class Repeticao4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();
        int fatorial=1;
        System.out.printf("O fatorial de %d é ", numero);
        for (int i=numero ;i>0; i--) {
            fatorial *= i;
        }
        System.out.print(fatorial);


    }
}
