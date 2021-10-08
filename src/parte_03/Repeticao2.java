package parte_03;

/*IMPORTANTE: A QUESTÃO DIZ "Imprima a soma entre 100 e 1000", NESSE CASO ESTOU PREZUMINDO QUE É
* PARA SER REALIZADO A SOMA DE TODOS OS NÚMEROS ENTRE 100 E 1000, OU SEJA, 101 + 102 + 103... */

public class Repeticao2 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){
        //Variável utilizada
        short i;
        int setCount = 0;

        //Estrutura de repetição para somar valores entre 100 e 1000
        for(i= 101; i < 1000; i++){
            setCount += i;
        }

        //Imprime resultado
        System.out.println("A soma total dos valores entre 100 e 1000 é de: " + setCount);
    }
}
