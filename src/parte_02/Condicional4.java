package parte_02;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int num = entrada.nextInt();

        if (num <= 100 && num >= 90)
            System.out.println("Você tirou um A.");
        else if (num <= 89 && num >= 80) {
            System.out.println("Você tirou um B.");
        }else if (num <= 79 && num >= 70) {
            System.out.println("Você tirou um C.");
        }else if (num <= 69 && num >= 60) {
            System.out.println("Você tirou um D.");
        }else if (num <= 59 && num >= 40) {
            System.out.println("Você tirou um E.");
        }else if (num <= 39 && num >= 0){
            System.out.println("Você tirou um F.");
        }else {
            System.out.println("Digite uma nota valida.");
        }
    }
}
