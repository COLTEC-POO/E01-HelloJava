package parte_01;

public class BalancoTrimestral {

        public static void main(String args[]) {
            int gastosJaneiro = 15000;
            int gastosFevereiro = 17000;
            int gastosMarco = 23000;
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
            int mediaMensal = gastosTrimestre / 3;

            System.out.println("Gastos do trimestre:" + gastosTrimestre);
            System.out.println("Media de gastos:" + mediaMensal);
        }

}
