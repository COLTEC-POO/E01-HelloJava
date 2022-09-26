package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String [] args) {

        int num;      

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um numero para saber se eh multiplo de 7:  ");
        num = entrada.nextInt();

        boolean multiplo7 = num %7 == 0;

        if(multiplo7){
            System.out.println("O numero " + num + " eh multiplo de 7.");
        } else {
            System.out.println("O numero " + num + " nao eh multiplo de 7.");
        }
        
    }
    
}
