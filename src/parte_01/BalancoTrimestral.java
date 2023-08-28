package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        //variável de média mensal de gastos
        int mediaMensal = gastosTrimestre / 3;

        System.out.println("Gastos do trimestre: " + gastosTrimestre);
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}
