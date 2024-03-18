package parte_02;

//Parte 2-b:
//importar a classe Scanner
import java.util.Scanner;

//Classe MultiploDe7 - Scanner
public class Condicional2 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Eh multiplo de 7?");

        //variavel para guardar o numero
        int numero;

        //criar um objeto para o scanner coletar o valor
        Scanner input = new Scanner(System.in);

        //pedir ao usuario para digitar um numero:
        System.out.print("Digite um numero inteiro qualquer: ");
        numero = input.nextInt(); //lê o número fornecido pelo usuário, e armazena em 'numero'

        //descobrir se eh multiplo de 7
        if(numero % 7 == 0) {
            System.out.println("eh multiplo de 7!");
        } else {
            System.out.println("nao eh multiplo de 7 :(");
        }

        //fechar o scanner para evitar vazamentos de dados
        input.close();
    }
}
