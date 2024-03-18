package parte_03;

public class Repeticao4 {
    public static void main(String[] args){
        int result=10;
        for(int i=9; i>=1; i--){
            result= result*i;
        }
        System.out.println("Fatorial de 10:");
        System.out.println(result);
    }
}
