package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int valorInserido;
        final int OK = 0;

        do{
            System.out.print("Verifique se um numero é par ou impar (0 para sair): ");
            valorInserido = entrada.nextInt();

            if(valorInserido != OK){
                if(valorInserido % 2 == 0){
                    System.out.println(valorInserido + " é par");
                }else{
                    System.out.println(valorInserido + " é impar");
                }
            }
        }while(valorInserido != OK);


    }
}
