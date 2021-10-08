package parte_02;

import java.util.Scanner;
// Essa Classe está destinada a realizar testes de números e identificar se são multiplos de sete ou não
public class Condicional2 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){

        //Variáveis utilizadas
        int getNumberValue;
        byte getContinue;

        //Inclusão da função scanner
        Scanner input = new Scanner(System.in);

        do {
            //Solicitação de dados ao usuário
            System.out.print("Por favor, informe um número para verificar se ele é multiplo de sete: ");
            getNumberValue = input.nextInt();

            //teste condicional: se Numero % 7 = é um divisor inteiro, ou seja, é um multiplo de sete.
            if(getNumberValue % 7 != 0){
                System.out.println("O número " + getNumberValue + " não é um multiplo de sete");
            } else {
                System.out.println(getNumberValue + " é um multiplo de sete");
            }

            //Verificando continuidade da função
            do{
                //Instruções para o usuário
                System.out.println("Deseja realizar o mesmo teste para outro número?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução
                if (getContinue > 1 || getContinue < 0){
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }

            }while ((getContinue < 0) || (getContinue > 1));


        }while (getContinue != 0);
    }
}