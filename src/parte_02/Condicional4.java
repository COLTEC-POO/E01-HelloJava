package parte_02;
import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("Digite a nota do aluno:");
        nota = scanner.nextInt();
        if(nota>=90){
            System.out.println("Resultado do aluno:A");
        }else if(nota>=80 && nota<=89){
            System.out.println("Resultado do aluno:B");
        }else if(nota>=70 && nota<=79){
            System.out.println("Resultado do aluno:C");
        }else if(nota>=60 && nota<=69){
            System.out.println("Resultado do aluno:D");
        }else if(nota>=40 && nota<=59){
            System.out.println("Resultado do aluno:E");
        }else if(nota<=40){
            System.out.println("Resultado do aluno:F");
        }

    }
}
