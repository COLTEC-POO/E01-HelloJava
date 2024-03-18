package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int Num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int Num2 = sc.nextInt();

        if(Num1 > Num2){
            System.out.printf("O numero %d e o maior\n",Num2);
        }
        else if(Num1 == Num2){
            System.out.println("Ambos numeros tem o mesmo valor");
        }
        else{
            System.out.printf("O numero %de o maior\n",Num2);
        }

    }
}