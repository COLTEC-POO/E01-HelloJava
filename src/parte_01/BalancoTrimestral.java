package parte_01;

public class BalancoTrimestral {
    public static void main(String[] args){
        int gastosJaneiro =15_000; // Para representar a dezena de milhares, pode colocar _
        int gastosFevereiro = 23_000;
        int gastosMarco = 17_000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaTrimestre = gastosTrimestre / 3;

        System.out.println("Gastos do Trimestre: R$" + gastosTrimestre);
        System.out.println("Media do Trimestre: R$" + mediaTrimestre);
    }
    
}
