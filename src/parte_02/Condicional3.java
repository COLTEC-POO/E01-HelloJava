package parte_02;

//Parte 2-a:
//importar a classe Scanner
import java.util.Scanner;

//Classe OlhaAbomba - Scanner
public class Condicional3 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Sera que passou de ano?");

        //variavel para guardar a nota
        int nota;

        //criar um objeto para o scanner coletar o valor
        Scanner input = new Scanner(System.in);

        //pedir ao usuario para digitar a nota:
        System.out.print("Digite sua nota de 0 a 100 no ano letivo: ");
        nota = input.nextInt(); //lê o número fornecido pelo usuário, e armazena em 'nota'

        //descobrir se o aluno passou
        if(nota >= 60) {
            System.out.println("Parabens! Voce passou :)");
        } else {
            System.out.println("Eita olha a bomba! Poxa... Voce nao passou :(");
        }

        //fechar o scanner para evitar vazamentos de dados
        input.close();
    }
}