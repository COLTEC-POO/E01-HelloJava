package parte_02;
import java.util.Scanner;

class Condicional2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = input.nextDouble();

        if(numero%7 == 0){
            System.out.println("Esse número é múltiplo de 7!");
        }
        else{
            System.out.println("Esse número não é múltiplo!");
        }
    }
}
