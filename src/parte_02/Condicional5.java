package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {
        int x, y;      

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o primeiro numero:  ");
        x = entrada.nextInt();

        System.out.print("Insira o segundo numero:  ");
        y = entrada.nextInt();


        boolean xMaior = x > y;
        boolean yMaior = y > x;

        if(xMaior){
            System.out.println("O numero " + x + " eh maior do que " + y + ".");
        } else if (yMaior){
            System.out.println("O numero " + y + " eh maior do que " + x + ".");
        } else {
            System.out.println("Os numeros sao iguais");
        }

    }
    
}
