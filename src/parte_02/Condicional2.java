package parte_02;

import java.util.Scanner;
public class Condicional2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero para saber se é multiplo de 7: ");
        numero = entrada.nextInt();

        if (numero % 7 == 0){
            System.out.println("É multiplo de 7.");
        }else{
            System.out.println("Não é múltiplo de 7.");
        }
    }
}
