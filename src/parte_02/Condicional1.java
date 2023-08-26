package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("par ou impar?: ");
        num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse numero eh par!");
        }
        else{
            System.out.println("Esse numero eh impar!");
        }

    }

}
