//Inclusoes
package parte_03;
import java.util.Scanner;

public class Repeticao3 {
    //Programa principal
    public static void main(String[] args) {

        //Funcao de entrada de dados
        Scanner input = new Scanner(System.in);

        //Imprime todos os multiplos de 7 até 100
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
