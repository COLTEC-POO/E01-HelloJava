import java.util.Scanner;
public class Condicional2 {
    public static void main(String[] args){
        System.out.println("Digite um numero e eu direi se ele é multiplo de 7 ou não!");
        Scanner pegador = new Scanner(System.in);
        int numero = pegador.nextInt();
        if(numero%7 == 0){
            System.out.println("O numero é multiplo de 7");
        }else{
            System.out.println("O numero não é multiplo de 7");
        }
    }
}