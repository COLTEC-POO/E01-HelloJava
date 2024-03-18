package parte_02;

import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Condicional5 {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int num1, num2;

        // Pede ao usuario dois numeros
        System.out.println("Digite dois numeros, em seguida veja qual deles é maior");
        num1 = entradaTeclado.nextInt();
        num2 = entradaTeclado.nextInt();

        if (num1 > num2) {
            System.out.println(+ num1 +" é maior que " + num2);

        } else if (num2 > num1) {
            System.out.println(+ num2 +" é maior que " + num1);

        } else {
            System.out.println(+ num1 +" são iguais " + num2);
        }
    }
}
