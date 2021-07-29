package Banco;

public class ContaCorrente extends Conta {
    private Cliente cliente;
    public ContaCorrente(String nome, String cpf, int agencia, int numero) {
        super(agencia, numero);
        this.cliente = new Cliente(nome, cpf);
    }


    @Override
    public void sacar(double valor) {
        double taxa = 0.10;
        double saldo = this.getSaldo();
        if(valor <= saldo){
            saldo = saldo - valor - taxa;
        }else{
            System.out.println("Não foi possivel realizar o saque!");
            System.out.println("Valor de saque é superior ao saldo em conta");
        }
    }

    public void cadastro(){
        System.out.println("Nome: "+ this.cliente.getNome());
        System.out.println("Cpf: "+ this.cliente.getCpf());
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Numero: " + this.numero);
    }



}