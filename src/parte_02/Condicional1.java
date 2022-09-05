package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número a ser analisado: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número é par");
        } else{
            System.out.println("O número é ímpar");
          }

    }

}
