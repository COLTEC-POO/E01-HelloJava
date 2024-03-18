package parte_01;

public class BalancoTrimestral {

    public static void main (string[] args){

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
        System.out.println("Média de gastos: " + (gastosTrimestre/3));
    }
}
