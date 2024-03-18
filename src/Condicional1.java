import java.util.Scanner;
public class Condicional1 {
    public static void main(String[] args){
        System.out.println("Digite um numero e eu direi se ele é par ou impar!");
        Scanner pegador = new Scanner(System.in);
        int numero = pegador.nextInt();
        if(numero%2 == 0){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
