package parte_02;
import java.util.Scanner;

public class Condicional5 {
    public static void main (String[] args){

        Scanner entrada =  new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite um numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite outro numero:");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro numero (" + num1 + ") " + "é maior do que o segundo numero (" + num2 + ").");
        } else if (num2 > num1){
            System.out.println("O segundo numero (" + num2 + ") " + "é maior do que o primeiro numero (" + num1 + ").");
        } else {
            System.out.println("Os dois numeros digitados são iguais.");
        }
    }
}
