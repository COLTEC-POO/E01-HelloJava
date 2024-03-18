package parte_03;

public class Repeticao3 {
    public static void main(String[] args) {

        System.out.println("Numeros de 1 a 100 multiplos de 7");

        for(int i = 1; i <= 100; i++) {

            if ((i % 7) == 0) {

                System.out.println(i);

            }
        }
    }
}

