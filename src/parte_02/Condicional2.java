package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int valorInserido;
        final int OK = 0;

        do{
            System.out.print("Verifique se um numero é Multiplo de 7 (0 para sair): ");
            valorInserido = entrada.nextInt();

            if(valorInserido != OK){
                if(valorInserido % 7 == 0){
                    System.out.println(valorInserido + " é multiplo de 7");
                }else{
                    System.out.println(valorInserido + " não é multiplo de 7");
                }
            }
        }while(valorInserido != OK);


    }
}
