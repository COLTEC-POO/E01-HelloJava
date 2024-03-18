package parte_02.parte_2;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("\nDigite um numero para vericação(Par ou Impar): ");
            int numero = scanner.nextInt(); //Criando variável int com o número a ser verificado

            if(numero % 2 == 0) //Verifica se o número é par,caso seja,imprime isso
                System.out.println("O numero digitado é par!");

            else //Caso não seja par,imprime isso
                System.out.println("O numero digitado é ímpar!");

            System.out.print("Digite se deseja repetir o processo(S/N): ");
            char opcao = scanner.next().charAt(0); //Variável para verificar se a pessoa deseja repetir

            if(opcao == 'S' || opcao == 's') //Caso a pessoa digite 'S' ou 's',o loop irá reiniciar
                continue;

            else //Caso contrário,não
                break;

        }

    }

}