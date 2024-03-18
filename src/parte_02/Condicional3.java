package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a nota final do seu aluno : ");
        int Nota = sc.nextInt();

        if(nota_final >= 60){
            System.out.println("O aluno passou de ano");
        }
        else{
            System.out.println("O aluno nao passou de ano");
        }
    }
}
