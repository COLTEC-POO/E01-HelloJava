package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastorMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastorMarco;

        System.out.println("Gastos do trimestre = " + gastosTrimestre);

        double mediaMensal = gastosTrimestre / 3.0;

        System.out.println("Valor da media mensal = " +mediaMensal);
    }
}

