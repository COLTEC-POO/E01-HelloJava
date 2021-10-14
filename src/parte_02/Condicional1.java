package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero para saber se par ou impar: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("Numero par.");
        }else{
            System.out.println("Numero impar.");
        }
    }
}
