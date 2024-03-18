package parte_02;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota do aluno: ");
        int num = scan.nextInt();

        if (num >= 60) {
            System.out.println("Passou");
        }else{
            System.out.println("Não passou");
        }
    }
}
