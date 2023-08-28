package parte_03;

public class Repeticao2 {
    
    public static void main(String[] args) {

        int inicio = 100, fim = 1000, soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma dos valores de 100 até 1000 é " + soma);

    }
}
