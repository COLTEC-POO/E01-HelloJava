package parte_02;

import java.util.Scanner;

public class CondicionalX {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int escolha = 0;

        System.out.println("Digite o que deseja:\n" +
                "(1)- saber se o número é par ou impar\n" +
                "(2)- saber se o número é múltiplo de 7\n" +
                "(3)- Verificar se o aluno passou de ano\n" +
                "(4)- Saber o desempenho do aluno\n" +
                "(5)- Saber qual é o maior número\n" +
                "Escolha: ");

        escolha = input.nextInt();

        switch (escolha){

            case 1:
                int numero_Case1;

                System.out.println("Digite o número que deseja para saber se é par ou impar: ");
                numero_Case1 = input.nextInt();

                if (numero_Case1 % 2 != 0){
                    System.out.println("O número "+ numero_Case1 +" é impar!");
                }
                else {
                    System.out.println("O número "+numero_Case1+" é par");
                }
                break;

            case 2:
                int numero_Case2;

                System.out.println("Digite o número para saber se ele é múltiplo de 7: ");
                numero_Case2 = input.nextInt();

                if (numero_Case2 % 7 != 0){

                    System.out.println("O número "+numero_Case2+" Não é divisível por 7");
                }
                else {
                    System.out.println("O número "+numero_Case2+" é divisível por 7");
                }

                break;

            case 3:
                int nota_Aluno;

                System.out.println("Digite a nota do aluno: ");
                nota_Aluno = input.nextInt();

                if(nota_Aluno < 60){
                    System.out.println("Infelizmente o aluno não passou de ano!");
                }
                else {
                    System.out.println("O aluno passou de ano!");
                }

                break;

            case 4:

                int nota_Aluno_Desempenho;

                System.out.println("Digite a nota do aluno: ");
                nota_Aluno_Desempenho = input.nextInt();

                if(nota_Aluno_Desempenho > 90){
                    System.out.println("Nota A! O aluno foi excelente!");
                } else if (nota_Aluno_Desempenho > 80 && nota_Aluno_Desempenho < 89) {
                    System.out.println("Nota B! O aluno foi Nota B");
                } else if (nota_Aluno_Desempenho > 70 && nota_Aluno_Desempenho < 79) {
                    System.out.println("Nota C! O aluno foi Nota C");
                } else if (nota_Aluno_Desempenho > 60 && nota_Aluno_Desempenho < 69) {
                    System.out.println("Nota D! O aluno foi Nota D");
                }else if (nota_Aluno_Desempenho > 50 && nota_Aluno_Desempenho < 59) {
                    System.out.println("Nota E! O aluno foi Nota E");
                }else if (nota_Aluno_Desempenho < 40) {
                    System.out.println("Nota F! O aluno foi Nota F");
                }

                break;

            case 5:
                int primeiro_Numero;
                int segundo_Numero;

                System.out.println("Digite o primeiro número e de enter: ");
                primeiro_Numero = input.nextInt();

                System.out.println("Digite o segundo número e de enter: ");
                segundo_Numero = input.nextInt();

                if (primeiro_Numero == segundo_Numero){
                    System.out.println("Os dois números digitados são iguais");
                } else if (primeiro_Numero > segundo_Numero) {
                    System.out.println("O número "+primeiro_Numero+" é maior que o número "+segundo_Numero);

                } else {
                    System.out.println("O número " + segundo_Numero + " é maior que o número " + primeiro_Numero);
                }
                break;

        }
    }
}