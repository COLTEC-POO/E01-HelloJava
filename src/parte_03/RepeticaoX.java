package parte_03;

public class RepeticaoX {
    public static void main(String[] args) {

        System.out.println("Primeira parte");
        for (int i = 101; i < 1000; i++){
            System.out.println(i);
        }

        System.out.println("Segunda parte");

        int soma_Parte2 = 0;
        for (int j = 100; j < 1000; j++){
            soma_Parte2 += j;
        }
        System.out.println("A soma de 100 a 1000 é: "+soma_Parte2);
        System.out.println("Terceira parte");

        for (int k = 0; k < 100; k++){
            if (k % 7 == 0){
                System.out.println(k);
            }
        }

        System.out.println("Quarta parte");
        int fatorial_De_5 = 1;
        //fatorial = 5!
        // 1.2.3.4.5

        for (int l = 1; l <= 5; l++){
            fatorial_De_5 *= l;
        }
        System.out.println("O fatorial de 5 é: "+fatorial_De_5);
    }
}
