//Inclusoes
package parte_02;
import java.util.Scanner;

public class Condicional2 {
    //Programa principal
    public static void main(String[] args) {
        //Funcao de entrada de dados
        Scanner input = new Scanner(System.in);

        //Declaracao da variavel value
        //Recebe o valor inserido pelo usuario
        System.out.println("Digite um valor inteiro: ");
        int value = input.nextInt();

        //Se o valor for divisivel por 7, entao eh multiplo
        if(value % 7 == 0){
            System.out.println("Esse numero é multiplo de sete!");
        }else{
            System.out.println("Esse numero nao é multiplo de sete!");
        }
    }
}

