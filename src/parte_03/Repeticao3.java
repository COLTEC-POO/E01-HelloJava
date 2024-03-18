package parte_03;

public class Repeticao3 {

    public static void main(String[] args) {
        int num = 1;

        System.out.println("Múltiplos de 7 entre 1 e 100");

        for (int i = 0; i < 100; i++) {
            if ((num%7) == 0) {
                System.out.println(+ num);

            }
            num++;
        }
    }
}