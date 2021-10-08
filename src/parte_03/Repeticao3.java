package parte_03;

//Classe destinada a imprimir todos os multiplos de 7 entre 1 e 100
public class Repeticao3 {

    // Função main - primeira função a ser executada pela JVM/COMPILADOR
    public static void main(String[] args){
        //Variável utilizada
        byte i;

        //Estrutura de repetição para varrer os números entre 1 e 100
        for(i = 2; i <= 99; i++){
            //Estrutura condicional para verificar quais números são multiplos de sete
            if (i % 7 == 0){
                System.out.println("O número " + i + " é um multiplo de sete");
            }
        }
    }
}
