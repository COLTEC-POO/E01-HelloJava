package parte_02;
import java.util.Scanner;
public class Condicional4 {
            public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome da disciplina:");
            String materia = scanner.nextLine();
            System.out.println("Digite a nota do aluno:");
            float numero = scanner.nextFloat();
            System.out.print("O conceito do Aluno " + materia + " foi ");

            if(numero>=90){
                System.out.println("A");
            }
            else if(numero>=80){
                System.out.println("B");
            }
            else if(numero>=70){
                System.out.println("C");
            }
            else if(numero>=60){
                System.out.println("D");
            }
            else if(numero>=40){
                System.out.println("E");
            }
            else{
                System.out.println("F");
            }
        }
    }


