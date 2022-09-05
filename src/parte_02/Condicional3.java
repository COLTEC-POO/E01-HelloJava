package parte_02;
import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a nota: ");
        float nota = entrada.nextFloat();


        if(nota>= 60){
            System.out.println("O aluno passou.");
        } else {
            System.out.println("O aluno não passou.");
            }
    }
}
