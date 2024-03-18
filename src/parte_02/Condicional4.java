package parte_02;

//Parte 2-c:
//importar a classe Scanner
import java.util.Scanner;

//Classe OConceito - Scanner
public class Condicional4 {
    //Bloco main
    public static void main (String[] args) {
        System.out.println("Qual a sua nota conceito?");

        //variavel para guardar a nota
        int nota;

        //criar um objeto para o scanner coletar o valor
        Scanner input = new Scanner(System.in);

        //pedir ao usuario para digitar a nota:
        System.out.print("Digite sua nota de 0 a 100 no ano letivo: ");
        nota = input.nextInt(); //lê o número fornecido pelo usuário, e armazena em 'nota'

        //descobrir se a nota conceito do aluno
        if (nota >= 90) {
            System.out.println("Uau! So notas altas, parabens! Conceito A");
        } else if (nota < 90 && nota >= 80) {
            System.out.println("Muito bem! Conceito B");
        } else if (nota < 80 && nota >=70) {
            System.out.println("Bom! Conceito C");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Passou raspando hein?! Conceito D");
        } else {
            System.out.println("Sinto muito, vc bombou. Conceito E");
        }

        //fechar o scanner para evitar vazamentos de dados
        input.close();
    }
}
