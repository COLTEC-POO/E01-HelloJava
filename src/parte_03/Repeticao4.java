package parte_03;
import java.util.Scanner;
public class Repeticao4 {
    public static void main( String[] args){
    int numero;
    int fatorial=1;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero inteiro para saber o seu fatorial: ");
    numero= entrada.nextInt();
    
    
    for(int i=1; i<=numero; i++){
        fatorial = fatorial*i;
    }

    System.out.println("O fatorial de " + numero+ " é: " +fatorial);

    entrada.close();


    

}
}
