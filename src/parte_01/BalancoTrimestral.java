package parte_01;

public class BalancoTrimestral {

    public static void main(String[] args){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrismestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrismestre /3;

        System.out.println("Gastos do trimestre: " + gastosTrismestre);
        System.out.println("Média de gastos: " + mediaMensal);


    }
}
