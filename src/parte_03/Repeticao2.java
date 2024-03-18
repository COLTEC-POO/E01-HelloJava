package parte_03;

public class Repeticao2
{
    public static void main(String[] args)
    {//o que a atividade ta pedindo ta meio confuso mas eu acho que é pra imprir a soma de todos os numeros entre 100 e 1000 certo?

        //declaramos a variavel que vai armazenar o valor da soma
        int soma = 0;

        //fazer um for para somar tudinho
        for(int i = 100; i <= 1000; i++) {
            soma = soma + i;
        }

        //imprimimos a soma
        System.out.println(soma);
    }
}
/*a soma de todos os numero de 100 a 1000 é 500500 so que a bosta do programa ta falando que é 495550 por algum motivo eu tentei um tanto de
coisa inutil pra resolver mas so deu 500500 quando eu coloquei que i = 0, o que na teoria nao soma todos os numero de 100 a 1000 entao deixei
assim, mesmo que a soma esteja dando errado por algum motivo o programa ta certo eu acho*/

