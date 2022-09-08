package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("Informe o primeiro número: ");
        valor1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        valor2 = teclado.nextInt();

        if(valor1 > valor2){
            System.out.println(valor1 + " é maior que " + valor2);
        }else if(valor2 > valor1){
            System.out.println(valor2 + " é maior que " + valor1);
        }else{
            System.out.println(valor1 + " é igual à " + valor2);
        }

    }
}
