package Banco;


public class ContaPoupanca extends Conta{
    private Cliente cliente;
    public ContaPoupanca(int agencia, int numero, String nome, String cpf){
        super(agencia, numero);
        this.cliente = new Cliente(nome, cpf);
    }


    @Override
    public void sacar(double valor) {
        double saldo = this.getSaldo();
        if(valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.println("Não foi possivel realizar o saque!");
            System.out.println("Valor de saque é superior ao saldo em conta");
        }
    }
}


