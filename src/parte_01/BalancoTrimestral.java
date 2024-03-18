package parte_01;

public class BalancoTrimestral {

    public static void main(String[] args) {

        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;

        double gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        System.out.println("Gastos do trimestre: " + gastosTrimestre);
        System.out.println("Média dos gastos: " + (gastosTrimestre/3) );


    }

}
