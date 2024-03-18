package parte_02;


import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (0 a 100): ");
        int nota = scanner.nextInt();

        if (nota >= 60) {
            System.out.println("O aluno passou de ano.");
        } else {
            System.out.println("O aluno não passou de ano.");
        }
    }
}
