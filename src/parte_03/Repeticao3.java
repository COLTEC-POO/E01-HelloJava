package parte_03;

public class Repeticao3
{
    public static void main(String[] args)
    {
        //frase de comecinho so pra ficar bonito
        System.out.printf("Os multiplos de 7 são: ");

        //for pra pegar todos os numero entre 1 e 100
        for(int i = 1; i <= 100; i++) {

            //checar se é multiplo de sete
            if(i % 7 == 0) {
                System.out.printf(i + " ");
            }
        }
    }
}
