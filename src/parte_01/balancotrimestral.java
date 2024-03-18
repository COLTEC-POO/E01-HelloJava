package parte_01;

public class balancotrimestral {
    public static void main(String[] args) {
        int balancotrimestral;
        int gastosjaneiro = 15000;
        int gastosfevereiro = 23000;
        int gastosmarco = 17000;
        int gastostrimestre;
        double mediamensal = 0;

        gastostrimestre = gastosjaneiro+gastosfevereiro+gastosmarco;
        System.out.println (gastostrimestre);
        mediamensal = (double) gastostrimestre /3;
        System.out.println ("Valor da média mensal = "+mediamensal);
    }
}

