
import java.util.Scanner;
public class Condicional4 {
    public static void main(String[] args){
        System.out.println("Digite sua nota e eu direi seu conceito!");
        Scanner pegador = new Scanner(System.in);
        int numero = pegador.nextInt();
        if(numero >= 90){
            System.out.println("Você tirou A");
        }else if(numero >= 80){
            System.out.println("Você tirou B");
        }else if(numero >= 70){
            System.out.println("Você tirou C");
        }else if(numero >= 60){
            System.out.println("Você tirou D");
        }else if(numero >= 40){
            System.out.println("Você tirou E");
        }else{
            System.out.println("Você tirou F");
        }
    }
}
