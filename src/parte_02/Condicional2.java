import java.util.*;
public class Condicional2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int Numero = number.nextInt();

        if(Numero % 7 == 0){
            System.out.println("Esse numero e multiplo de 7!");
        }else{
            System.out.println("Esse numero nao e multiplo de 7!");
        }
    }
}
