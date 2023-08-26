package parte_03;

import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;
        int fatorial = 1;

        System.out.print("Digite o valor para calcular a sua fatorial: ");
        num = input.nextInt();

        for(int i = 1; i <= num; i++){

            fatorial *= i;
        }
        System.out.println("A fatorial de eh: "+ fatorial);
    }
}
