package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){
        // Variáveis utilizadas
        float getGradeValue;
        byte getContinue;

        //Inclusão da função scanner
        Scanner input = new Scanner(System.in);

        //Estrutura de repetição para garantir a continuidade de execução.
        do {
            //Solicitando informações do usuário
            System.out.println("Por favor, informe a sua nota (de 0 a 100, separando as casas decimais por vírgula) para identificar o seu conceito");
            System.out.print("Informe sua nota: ");
            getGradeValue = input.nextFloat();

            // Instruções da questão
            //A - 90 ou superior
            //B - 80 a 89
            //C - 70 a 79
            //D - 60 a 69
            //E - 40 a 59
            //F - menos de 40

            if (getGradeValue >= 90){
                System.out.println("Parabéns, o seu conceito atual é [A]. Já podemos ficar mais tranquilos agora que Einstein reencarnou");
            } else if (getGradeValue >= 80 && getGradeValue <= 89){
                System.out.println("WOW! Parabéns, o seu conceito é o [B], o seu esforço está sendo incrível, continue assim!");
            } else if (getGradeValue >= 70 && getGradeValue <= 79) {
                System.out.println("Parabéns, o seu conceito atual é o [C], continue assim!");
            }else if (getGradeValue >= 60 && getGradeValue <= 69) {
                System.out.println("Parabéns, você se encontra na média e o seu conceito é atual é [D]");
            }else if (getGradeValue >= 40 && getGradeValue <= 59) {
                System.out.println("Passou perto! No momento o seu conceito é [E], com um pouco mais de esforço você conseguirá alcançar a média e obter conceito [D] ");
            } else{
                System.out.println("No momento o seu conceito é [F], caso esteja com dificuldade, procure o setor Pedagógico para uma conversa.");
            }

            //Verificando se há necessidade de dar continuidade a função
            do {
                //Instruções para o usuário
                System.out.println("Deseja informar uma outra nota e vê o seu conceito?");
                System.out.print("Digite [1] para SIM e [0] para NÃO: ");
                getContinue = input.nextByte();//obtendo o valor para continuidade da execução
                if (getContinue > 1 || getContinue < 0) {
                    System.out.println("O valor digitado não corresponde a nenhuma das opções, por favor tente novamente.");
                }

            } while ((getContinue < 0) || (getContinue > 1));
        } while (getContinue != 0);
    }
}
