package parte_02;
import java.util.Scanner;
class Condicional5{
    public static void println(String string){
        System.out.println(string);
    }
    public static void print(String string){
        System.out.print(string);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        print("Digite o primeiro numero : ");
        int a = sc.nextInt();
        print("Digite o segundo numero : ");
        int b = sc.nextInt();
        int maior = a;
        if (b > a){
            maior = b;
        }
        println("Maior : " + maior);
    }
}