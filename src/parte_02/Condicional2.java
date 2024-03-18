package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();
        if(numero%7==0){
            System.out.println("O número digitado é múltiplo de 7.");
        }
        else{
            System.out.println("O número digitado não é múltiplo de 7.");
        }
    }
}