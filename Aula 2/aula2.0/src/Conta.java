public class Conta {
    //Atributos
    Cliente dono = new Cliente();
    public int numConta;
    public double saldo;
    public double limite;



    //Metodos
    public void imprimeDados(){
        System.out.println("=== Conta: " +  this.numConta + " ===");
        System.out.println("Dono: " + this.dono.nome);
        System.out.println("Limite: " + this.limite);

        imprimeSaldo();

    }

    private void imprimeSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }

    public boolean sacar(double valor){
        if(valor > this.saldo || valor < 0) return false;

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor){
        if(valor < 0){
            System.out.println("Impossível depositar esse valor");
            return false;
        }

        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        return true;

    }

    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            if(destino.depositar(valor)){
                System.out.println("Transferência realizada com sucesso!\n");
                return true;
            }
        }
        System.out.println("Transferência mal sucedida.");
        return false;
    }
}
