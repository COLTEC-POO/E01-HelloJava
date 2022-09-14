public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Bancario.");

        Conta contaErick = new Conta();
        Conta contaTata = new Conta();

        contaTata.dono.nome = "Tata Linda";
        contaTata.numConta = 30220353;
        contaTata.saldo = 85.00;
        contaTata.limite = 200.00;
        contaTata.dono.end = "pintor renato lima 2algumacoisa7";
        contaTata.dono.cpf = "03215479862";
        contaTata.dono.sexo = 'f';
        contaTata.dono.idade = 19;


        contaErick.dono.nome = "Erick";
        contaErick.numConta = 31741480;
        contaErick.saldo = 32.52;
        contaErick.limite = 1000.00;
        contaErick.dono.end = "Rua Olbiano Sausmikat 188";
        contaErick.dono.cpf = "14479890661";
        contaErick.dono.sexo = 'm';
        contaErick.dono.idade = 22;

        contaErick.imprimeDados();

        System.out.println();

        contaTata.imprimeDados();

        System.out.println();

        if(contaTata.transferir(0.56, contaErick)){

            System.out.println();

            contaErick.imprimeDados();

            System.out.println();

            contaTata.imprimeDados();
        }





    }
}