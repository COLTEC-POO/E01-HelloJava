package parte_02;

import java.util.Scanner;

public class Condicional1 {
    public  static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean ehPar;
        int valorLido;

        System.out.println("Informe um valor para verificar se é par ou impar: ");
        valorLido = entrada.nextInt();

        ehPar = (valorLido % 2 == 0);

        if(ehPar){
            System.out.printf("%s%d%s","O valor ", valorLido, " é par.");
        }else{
            System.out.printf("%s%d%s","O valor ", valorLido, " é impar.");
        }
    }
}
