package parte_01.parte_1;

public class BalancoTrimestral {

    public static void main(String[] args){

        //Criando e inicializando as variáveis int de gastos do mês
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        //Criando e inicializando a variável de gastos total do Trimestre(soma dos 3 meses)
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        //Imprimindo os gastos do trimestre
        System.out.printf("Gastos no trimestre: %d\n", gastosTrimestre);
        System.out.print("Valor da media mensal: " + (gastosTrimestre / 3) + "\n");

    }


}