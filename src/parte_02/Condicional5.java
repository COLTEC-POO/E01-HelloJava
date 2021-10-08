package parte_02;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args){
        //Variáveis utilizadas
        float getValueA, getValueB;
        byte getContinue;

        //Incluindo função scanner
        Scanner input = new Scanner(System.in);

        do{
            //Passando informações e solicitando entradas ao usuário
            System.out.print("Por favor, informe o primeiro número a ser verificado: ");
            getValueA = input.nextFloat();
            System.out.print("Agora, informe o segundo número: ");
            getValueB = input.nextFloat();

            //Condicional para verificar qual é o maior
            if(getValueA > getValueB){
                System.out.println("O número " + getValueA + " é maior que " + getValueB);
            } else{
                System.out.println("O número " + getValueB + " é maior que " + getValueA);
            }

            //Verificando continuidade da função
            do {
                //Instruções para o usuário
                System.out.println("Deseja verificar outros dois valores?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução

                if (getContinue > 1 || getContinue < 0) {
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }

            } while ((getContinue < 0) || (getContinue > 1));

        }while(getContinue != 0);
    }
}
