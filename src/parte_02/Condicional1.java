package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String [] args){

        int num;        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um numero para saber se eh impar ou par:  ");
        num = entrada.nextInt();

        boolean numeroPar = num %2 == 0;

        if(numeroPar){
            System.out.println("O numero " + num + " eh par.");
        } else {
            System.out.println("O numero " + num + " eh impar.");
        }
    }
    
}
