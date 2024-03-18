package parte_03;

public class Repeticao2 {
    public static void main(String[] args) {

        System.out.println("Soma dos numeros de 100 a 1000");

        int soma = 0;

        for(int i = 100; i <= 1000; i++) {

            soma  += i;
        }

        System.out.println(soma);
    }
}

