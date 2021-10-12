package parte_03;

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[]args){
        Scanner entrada= new Scanner (System.in);

        int i;
        int fat;
        int num;

        System.out.println("Informe o número no qual o fatorial será calculado:");
        num= entrada.nextInt();

        fat=num;

        for(i=1;i<num;i++){
          fat=fat*i;
        }

        System.out.println(fat);
    }
}
