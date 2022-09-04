package parte_02;

import java.util.Scanner;

public class Condicional2 {
    public  static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean ehMultiplo;
        int valorLido;

        System.out.println("Informe um valor para verificar se é multiplo de 7: ");
        valorLido = entrada.nextInt();

        ehMultiplo = (valorLido % 7 == 0);

        if(ehMultiplo){
            System.out.printf("%s%d%s","O valor ", valorLido, " é multiplo de 7.");
        }else{
            System.out.printf("%s%d%s","O valor ", valorLido, " não é multiplo de 7.");
        }
    }
}
