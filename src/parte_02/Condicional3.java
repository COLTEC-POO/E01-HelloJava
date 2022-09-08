//Inclusoes
package parte_02;
import java.util.Scanner;

public class Condicional3 {
    //Programa principal
    public static void main(String[] args) {
        //Funcao de entrada de dados
        Scanner input = new Scanner(System.in);

        //Recebe a nota do aluno
        System.out.println("Digite sua nota: ");
        double nota = input.nextDouble();

        //Imprime o conceito caso a nota encaixe em uma das condicoes
        if(nota >= 90) {
            System.out.println("Conceito A");
        }else if(nota >= 80) {
            System.out.println("Conceito B");
        }else if(nota >= 70) {
            System.out.println("Conceito C");
        }else if(nota >= 60){
            System.out.println("Conceito D");
        }else if(nota >= 40){
            System.out.println("Conceito E");
        }else{
            System.out.println("Conceito F");
        }
    }
}
