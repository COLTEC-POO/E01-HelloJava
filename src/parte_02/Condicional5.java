package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float primeiroValor, segundoValor;

        System.out.println("Infome o primeiro valor: ");
        primeiroValor = entrada.nextFloat();
        System.out.println("Infome o segundo valor: ");
        segundoValor = entrada.nextFloat();


        if(primeiroValor > segundoValor){
            System.out.printf("%s%.2f%s%.2f", "O valor ", primeiroValor, " é maior que ", segundoValor);
        } else if (segundoValor > primeiroValor) {
            System.out.printf("%s%.2f%s%.2f", "O valor ", segundoValor, " é maior que ", primeiroValor);
        }else {
            System.out.println("Os valores são iguais!");
        }
    }
}
