package parte_03;

public class Repeticao4 {
    public static void main(String[] args) {
        int i;
        int fatorial = 1;

        for (i = 10; i > 0; i--) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial do numero 10 é: " + fatorial);

    }
}

