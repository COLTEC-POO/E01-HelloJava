package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();
        if(numero%2==0){
            System.out.println("O número digitado é par.");
        }
        else{
            System.out.println("O número digitado é ímpar.");
        }
    }
}