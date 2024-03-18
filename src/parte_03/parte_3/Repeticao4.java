package parte_03.parte_3;

import java.util.Scanner;

public class Repeticao4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Criação de uma nova instancia de Scanner

        while(true){

            System.out.print("\nDigite o número para verificação de fatorial: ");
            long numero = scanner.nextLong(); //Estou criando em Long, pois a depender do número

            long fatorial = calculaFatorial(numero); //O fatorial pode ser bem maior que 'int'

            System.out.println("O fatorial do número "+ numero +" é igual à: "+ fatorial); //Chamo a função

            System.out.print("Deseja verificar outros fatoriais(S/N)? ");

            char opcao = scanner.next().charAt(0); //Verificar se deseja ver outros fatoriais

            if (opcao == 'S' || opcao == 's') //Caso deseje, continua no loop
                continue;

            else //Caso contrário, não
                break;
        }

    }

    private static long calculaFatorial(long n){ //Função não recursiva para calcular fatorial

        if(n == 0 || n == 1) //Caso o número seja 0 ou 1,retorna 1(1! = 1; 0! = 1)
            return 1;

        else{

            long fatorial = 1;

            for(int i=2; i<=n; i++) //Calculando fatorial
                fatorial *= i;

            return fatorial;

        }

    }

}