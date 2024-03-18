package parte_02;
import java.util.Scanner;
public class Condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = scanner.nextInt();
        if(nota >= 60){
            System.out.println("O aluno passou de ano");
        }
        else{
            System.out.println("O aluno reprovou");
        }
    }
}