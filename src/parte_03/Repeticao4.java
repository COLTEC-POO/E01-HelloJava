package parte_03;

public class Repeticao4 {
    public static void main(String[] args) {
        int numero = 3;
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
