package parte_03;

public class Repeticao3 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            boolean multiplo7 = i %7 == 0;
            
            if (multiplo7){
                System.out.println(i);
            }
         }

    }
    
}
