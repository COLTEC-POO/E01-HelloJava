package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num;
        int num2;

        System.out.print("Digite dois valores e veja qual eh o maior: \n");
        num = input.nextInt();
        num2 = input.nextInt();

        if(num > num2){
            System.out.println("O maior valor eh = "+ num);
        }
        else if(num2 > num){
            System.out.println("O maior valor eh = "+ num2);
        }
        else if(num == num2){
            System.out.println("Os dois valores sao iguais!");
        }

    }

}