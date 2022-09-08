//Inclusoes
package parte_02;
import java.util.Scanner;

public class Condicional1 {
    //Programa princial
    public static void main(String[] args) {
        //Funcao de entrada de dados
        Scanner input = new Scanner(System.in);

        //Declaracao da variavel value
        //Recebe o valor inserido pelo usuario
        System.out.println("Digite um valor inteiro: ");
        int value = input.nextInt();

        //Se o valor for divisivel por 2 retornara par
        //Caso contrario impar
        if(value % 2 == 0){
            System.out.println("O valor é par!");
        }else{
            System.out.println("O valor é ímpar!");
        }

    }
}
