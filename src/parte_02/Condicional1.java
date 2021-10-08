package parte_02;

import java.util.Scanner;

/*Tipos de variáveis numéricas byte, short, int e long (para inteiros).
* para números de ponto flutuante temos o float, e double. Quando utilizamos
* float, é necessário utilizar o f ao final do numero para indicar o tipo exp: "20.4f"
*
* Outros tipos de variáveis:
*   boolean pode receber os valores "true" ou "false" (2 bytes de tamanho)
*   char pode receber um unico caractere da tabela ascii (usar necessariamente aspas simples '') 1 bit
*
* Para identificar os tamanhos é possível acessar por meio da variável utilizando por exp "byte.MIN_VALUE"
* */

// Essa classe foi elaborada com a intenção de identificar se os números fornecidos são par ou ímpar
public class Condicional1 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){

        // Variáveis utilizadas
        int getNumberValue;
        byte getContinue;

        //Criar "autorização" de Scanner da entrada padrão
        Scanner input = new Scanner(System.in);

        //Estrutura de repetição para garantir que o usuário possa decidir se quer realizar o teste
        //mais de uma vez.

        do{
            //Intruções passadas para o usuário
            System.out.print("Por favor, insira um número para verificar se ele é par ou ímpar: ");
            getNumberValue = input.nextInt(); //Pegando e armazenando o valor inserido pelo usuario

            //Condicional de verificação para informar se o valor é ímpar ou par
            if (getNumberValue % 2 != 0) {
                System.out.println("O número " + getNumberValue + " é ímpar");
            } else {
                System.out.println("O número " + getNumberValue + " é par");
            }

            //Estrutura de repetição para garantir que o usuário só poderá escolher uma das opções listadas
            do {
                //Instruções para o usuário
                System.out.println("Deseja realizar o mesmo teste para outro número?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução
                if (getContinue > 1 || getContinue < 0){
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }
            } while ((getContinue < 0) || (getContinue > 1));

        }while(getContinue != 0); //Condição para continuidade da execução
    }
}
