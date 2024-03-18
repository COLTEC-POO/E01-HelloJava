package parte_02;
import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno:");
        int nota = scanner.nextInt();
        if(nota>=90){
            System.out.println("Nota Final: A");
        }else if(nota>=80&&nota<=89){
            System.out.println("Nota Final: B");
        }else if(nota>=70&&nota<=79){
            System.out.println("Nota Final: C");
        }else if(nota>=60&&nota<=69){
            System.out.println("Nota Final: D");
        }else if(nota>=40&&nota<=59){
            System.out.println("Nota Final: E");
        }else if(nota<40){
            System.out.println("Nota Final: F");
        }
    }
}
