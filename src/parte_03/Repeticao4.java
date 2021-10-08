package parte_03;

import java.util.Scanner;

//Classe destinada ao cálculo de fatoriais
public class Repeticao4 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){
        //Variáveis utilizadas
        int getNumberValue, setValueAux, i;
        byte getContinue;

        //Incluir função scanner
        Scanner input = new Scanner(System.in);

        do{
            //Instruções para o usuário e obtenção de valor de entrada
            System.out.print("Por favor, informe o número que deseja calcular o fatorial: ");
            getNumberValue = input.nextInt();

            //Pasando o valor da entrada para o auxiliar
            setValueAux = getNumberValue;

            //Tratamento para casos especiais
            if(getNumberValue == 0 || getNumberValue == 1){
                System.out.println(getNumberValue + "! é igual a 1");
            } else {
                //Tratamento padrão para fatorial
                for (i = (getNumberValue - 1); i > 1; i--){
                    setValueAux *= i;
                }

                //Exibir resultado: imprimindo o fatorial do número solicitado
                System.out.println(getNumberValue + "! é igual a " + setValueAux);
            }

            //Verificando se há necessidade de dar continuidade a função
            do {
                //Instruções para o usuário
                System.out.println("Deseja informar um outro número e vê o seu fatorial?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução
                if (getContinue > 1 || getContinue < 0) {
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }

            } while ((getContinue < 0) || (getContinue > 1));

        }while (getContinue != 0);
    }
}
