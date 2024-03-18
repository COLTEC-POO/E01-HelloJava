package parte_02;

import java.util.Scanner;

public class questao2
{

    static void condicional1()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um numero: ");
        num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.printf("seu numero eh par\n");
        }
        else
        {
            System.out.printf("seu numero eh impar\n");
        }

    }

    static void condicional2()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um numero: ");
        num = sc.nextInt();

        if(num % 7 == 0)
        {
            System.out.printf("seu numero eh multiplo de 7\n");
        }
        else
        {
            System.out.printf("seu numero nao eh multiplo de 7\n");
        }

    }

    static void condicional3()
    {
        int nota_final;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a nota final do seu aluno : ");
        nota_final = sc.nextInt();

        if(nota_final >= 60)
        {
            System.out.println("seu aluno foi aprovado");
        }
        else
        {
            System.out.println("seu aluno foi reprovado");
        }
    }

    static void condicional4()
    {
        int nota_final;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a nota final do seu aluno : ");
        nota_final = sc.nextInt();

        if(nota_final >= 90)
        {
            System.out.println("seu aluno foi nota A");
        }
        else if(nota_final >= 80 && nota_final <= 89)
        {
            System.out.println("seu aluno foi nota B");
        }
        else if(nota_final >= 70 && nota_final <= 79)
        {
            System.out.println("seu aluno foi nota C");
        }
        else if(nota_final >= 60 && nota_final <= 69)
        {
            System.out.println("seu aluno foi nota D");
        }
        else if(nota_final >= 49 && nota_final <= 59)
        {
            System.out.println("seu aluno foi nota E");
        }
        else if(nota_final < 40)
        {
            System.out.println("seu aluno foi nota F");
        }

    }

    static void condicional5()
    {
        int num_1 , num_2;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero : ");
        num_1 = sc.nextInt();
        System.out.println("digite outro numero : ");
        num_2 = sc.nextInt();

        if(num_1 > num_2)
        {
            System.out.printf("o numero %d (o 1 escolhido) eh o maior entre os 2 numeros\n",num_1);
        }
        else if(num_1 == num_2)
        {
            System.out.println("os dois numeros tem o mesmo valor");
        }
        else
        {
            System.out.printf("o numero %d (o 2 escolhido) eh o maior entre os dois numeros\n",num_2);
        }

    }
    public static void main(String[] args)
    {
        int option;
        Scanner sc = new Scanner(System.in);
        String advice;

        advice = "opcao invalida ,tente novamente";

        do
        {
            System.out.printf("digite qual das condicionais voce deseja acessar [1 a 5] \npara sair digite 0\nopcao : ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    condicional1();
                    break;

                case 2:
                    condicional2();
                    break;

                case 3:
                    condicional3();
                    break;

                case 4 :
                    condicional4();
                    break;
                case 5:
                    condicional5();
                    break;
                default:
                    System.out.println(advice);
                    break;
            }
        }while(option != 0);


    }



}
