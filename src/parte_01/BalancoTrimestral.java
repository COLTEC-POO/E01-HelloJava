package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){
        int gastosJaneiro = 15_000; //underscore para separar os milhares.
        int gastosFevereiro = 23_000;
        int gastosMarco = 17_000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaTrimestre = gastosTrimestre / 3;

        System.out.println("gastos do trimestre:" + gastosTrimestre);
        System.out.println("media:" + mediaTrimestre);

    }
}
