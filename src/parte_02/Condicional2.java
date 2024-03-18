package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero:");
        numero = scanner.nextInt();
        if(numero % 7 == 0){
            System.out.println("O numero: "+numero+" e multiplo de 7");
        }else{
            System.out.println("O numero: "+numero+" nao e multiplo de 7");
        }

    }
}
