package parte_02;

import java.util.Scanner;

public class Condicional5 {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os dois números são iguais.");
        }

    }

}
