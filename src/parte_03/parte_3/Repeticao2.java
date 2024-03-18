package parte_03.parte_3;

public class Repeticao2 {

    public static void main(String[] args){

        int soma = 0; //Criando uma variável para guardar o valor da soma

        for(int i=100; i<=1000; i++)
            soma += i; //Calculando a soma dos algarismos entre 100-1000

        System.out.println("A soma entre 100 e 1000 é: "+ soma); //Imprimindo a soma

    }

}