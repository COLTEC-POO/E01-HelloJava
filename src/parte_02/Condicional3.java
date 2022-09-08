package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Informe a sua nota: ");
        nota = input.nextInt();

        if (nota >= 60)
            System.out.println("voce passou");
        else
            System.out.println("voce nao passou");
    }
}
