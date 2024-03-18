package parte_03;

public class repeticao3 {
    public static void main(String[] args) {
        double x;
        double num = 0;
        for (x = 1; x < 101; x++) {
            num = x % 7;
            if (num == 0) {
                System.out.println(x);
            }
        }
    }
}

