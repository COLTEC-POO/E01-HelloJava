package parte_02;
import java.util.Scanner;
public class Condicional3 {
            public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a nota do aluno:");
            int numero = scanner.nextInt();
            if(numero>60){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
    }




