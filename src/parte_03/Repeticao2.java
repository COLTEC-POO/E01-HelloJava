package parte_03;

public class Repeticao2 {

    public static void main(String[] args) {
        int num = 100;
        int soma = 0;

        System.out.println("Soma entre 100 e 1000");

        for (int i = 0; i <= 900; i++) {
            soma += num;
            num++;
        }

        System.out.println(+ soma);
    }
}