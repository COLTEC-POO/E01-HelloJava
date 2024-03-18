public class BalancaTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gasto total no trimestre: " + gastosTrimestre);


        int mediaMensal = gastosTrimestre / 3;
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}


