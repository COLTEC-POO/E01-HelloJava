package parte_02;
import java.util.Scanner;
class Condicional1{
    public static void println(String string){
        System.out.println(string);
    }
    public static void print(String string){
        System.out.print(string);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print("Digite o número : ");
        int numero = sc.nextInt();
        if (numero%2 == 0){
            println("O número " + numero + " é par.");
        }else{
            println("O número " + numero + " é ímpar.");
        }
    }
}