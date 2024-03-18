package parte_02;
import java.util.Scanner;
public class Condicional5
{
    public static void main (String[] args) {

        //declara o scanner
        Scanner input = new Scanner(System.in);

        //declara os 2 numeros
        int num, num1;

        //le o primeiro numero
        System.out.print("Digite o primeiro número: ");
        num = input.nextInt();

        //le o segundo numero
        System.out.print("Digite o segundo número: ");
        num1 = input.nextInt();

        //verifica qual é maior ou se é igual
        if (num > num1) {
            System.out.println(num + "é maior que" + num1);
        } else if (num < num1) {
            System.out.println(num1 + "é maior que" + num);
        } else {
            System.out.println("os dois é igual");
        }
    }
}
