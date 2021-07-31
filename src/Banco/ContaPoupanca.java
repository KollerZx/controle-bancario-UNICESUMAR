package Banco;


public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nome, String cpf, int agencia, int numero) throws Exception {
        super(agencia,numero);
        this.pessoa = new Cliente(nome, cpf);
        this.saldo = 0;
    }


    @Override
    public void sacar(double valor) {

        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Não foi possivel realizar o saque!");
            System.out.println("Valor de saque é superior ao saldo em conta");
        }
    }


    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public int getAgencia() {
        return this.agencia;
    }

    @Override
    public int getNumero(){
        return this.numero;
    }
}



