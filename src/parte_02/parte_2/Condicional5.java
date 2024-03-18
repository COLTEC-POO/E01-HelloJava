package parte_02.parte_2;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Criação de uma instancia de Scanner

        while(true) {

            System.out.print("\nDigite o primeiro número para verificação: ");
            float numero1 = scanner.nextFloat();

            System.out.print("Digite o segundo número para verificação: ");
            float numero2 = scanner.nextFloat();

            //Farei de um jeito diferente do habitual,pois estou tentando absorver o máximo possível

            float maior_numero = Math.max(numero1, numero2);

            //Imprimindo o maior número entre numero1 e numero2

            System.out.printf("O maior número entre %.6f e %.6f é: %.6f!\n", numero1, numero2, maior_numero);

            System.out.print("Deseja verificar outros números(S/N)? ");

            char opcao = scanner.next().charAt(0); //Verificar se deseja ver a outros números

            if (opcao == 'S' || opcao == 's') //Caso deseje, continua no loop
                continue;

            else //Caso contrário, não
                break;

        }

    }

}