public class BalancoTrimestral {
    public static void main(String[] args) {
            int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
            double gastostrimestre = gastosJaneiro + gastosFevereiro + gastosMarco ;
            System.out.println("Gastos trimestre:" + gastostrimestre);
            System.out.printf("valor da media mensal = %.2f ",gastostrimestre / 3);
        }

}
