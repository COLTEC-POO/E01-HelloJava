package parte_02;
import java.util.Scanner;
class Condicional2{
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
        if (numero%7 == 0){
            println("O número " + numero + " é múltiplo de 7.");
        }else{
            println("O número " + numero + " não é múltiplo de 7.");
        }
    }
}