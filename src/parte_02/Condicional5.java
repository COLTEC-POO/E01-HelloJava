package parte_02;

import java.util.Random;

public class Condicional5 {
    public static void main(String[] args) {
        Random d1 = new Random();
        Random d2 = new Random();

        int dado1 = d1.nextInt(6) +1;
        int dado2 = d2.nextInt(6) +1;

        if (dado1 == dado2) {
            System.out.println("Os dados são iguais.");
        } else if (dado1 > dado2) {
            System.out.println("Dado 1(" + dado1 + ") é maior que o Dado2(" + dado2 +")");
        } else {
            System.out.println("Dado 2(" + dado2 + ") é maior que o Dado 1(" + dado1 +")");
        }
    }
}
