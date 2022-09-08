package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nota;

        System.out.println("Informe a sua nota: ");
        nota = input.nextInt();

        if (nota >= 90)
            System.out.println("voce passou com A");
        else if(nota >= 80 && nota < 89) {
            System.out.println("voce passou com B");
        }
        else if (nota >= 70 && nota < 79) {
            System.out.println("voce passou com C");
        }
        else if (nota >= 60 && nota < 69) {
            System.out.println("voce passou com D");
        }
        else if (nota >= 40 && nota < 59) {
            System.out.println("voce passou com E");
        }
        else{
            System.out.println("voce passou com F");
        }
    }
}
