package parte_03;
import java.util.Scanner;


public class questao3 {

    static void repeticao1()
    {
        int i;

        for(i = 100 ; i < 1000 ; i++)
        {
            System.out.println(i);
        }

    }
    static void repeticao2()
    {
        int i;
        int soma = 0;

        for(i = 100 ; i < 1000 ; i++)
        {
            soma = i + soma;
        }
        System.out.println(soma);
    }

    static void repeticao3()
    {
        int i;

        for(i = 1 ; i < 100 ; i++)
        {
            if(i % 7 == 0)
            {
                System.out.println(i);
            }
        }
    }

    static void repeticao4()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int i;
        int fatorial = 1;
        int soma = 0;

        System.out.printf("digite um numero : ");
        num = sc.nextInt();
        for(i = num ; i != 0 ; i--)
        {
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
    }

    public static void main(String[] args)
    {

        int option;
        Scanner sc = new Scanner(System.in);
        String advice;

        advice = "opcao invalida ,tente novamente";

        do
        {
            System.out.printf("digite qual das repeticoes voce deseja acessar [1 a 4] \npara sair digite 0\nopcao : ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    repeticao1();
                    break;

                case 2:
                    repeticao2();
                    break;

                case 3:
                    repeticao3();
                    break;

                case 4 :
                    repeticao4();
                    break;

                default:
                    System.out.println(advice);
                    break;
            }
        }while(option != 0);

    }

}