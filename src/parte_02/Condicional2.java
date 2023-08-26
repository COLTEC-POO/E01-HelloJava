package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Verifique se esse numero eh multiplo de 7: ");
        num = input.nextInt();

        if(num % 7 == 0){
            System.out.println("Eh multiplo de 7!");
        }
        else{
            System.out.println("Nao eh multiplo de 7!");
        }

    }

}