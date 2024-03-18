package parte_02.parte_2;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Criando nova instância de Scanner

        while(true){

            System.out.print("\nDigite um número que será verificado como múltiplo de 7: ");
            int numero = scanner.nextInt(); //Criando varíavel para verificação

            if(numero % 7 == 0) //Verificando se o número é múltiplo de 7
                System.out.println("O número digitado é múltiplo de 7!");

            else //Caso não seja, isso será imprimido
                System.out.println("O número digitado não é múltiplo de 7!");

            System.out.print("Digite se deseja repetir o processo(S/N): ");

            char opcao = scanner.next().charAt(0); //Criando variável para verificação de loop

            if(opcao == 'S' || opcao == 's') //Caso seja 'S' ou 's', o loop continua
                continue;

            else //Caso contrário, não
                break;

        }

    }

}