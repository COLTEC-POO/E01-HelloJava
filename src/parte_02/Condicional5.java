package parte_02;

//Parte 2-d:
//importar a classe Scanner
import java.util.Scanner;

//Classe OMaior - Scanner
public class Condicional5 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Qual o maior numero?");

        //variavel para guardar os numeros
        int numero1;
        int numero2;

        //criar um objeto para o scanner coletar o valor
        Scanner input = new Scanner(System.in);

        //pedir ao usuario para digitar os numeros
        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextInt(); //lê o número fornecido pelo usuário, e armazena em 'numero1'
        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextInt(); //lê o número fornecido pelo usuário, e armazena em 'numero2'

        //descobrir o maior numero
        if (numero1 > numero2) {
            System.out.println(numero1 + ">" + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + "<" + numero2);
        } else {
            System.out.println(numero1 + "=" + numero2);
        }


        //fechar o scanner para evitar vazamentos de dados
        input.close();
    }
}