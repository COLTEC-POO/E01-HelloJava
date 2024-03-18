
    import java.util.Scanner;
    public class Condicional3 {
        public static void main(String[] args){
            System.out.println("Digite sua nota e eu direi se passou de ano ou não!");
            Scanner pegador = new Scanner(System.in);
            int numero = pegador.nextInt();
            if(numero >= 60){
                System.out.println("Você pasoou");
            }else{
                System.out.println("Infelizmente você não passou");
            }
        }
    }
