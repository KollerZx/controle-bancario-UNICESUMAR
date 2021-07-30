package Banco;


public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nome, String cpf, int agencia, int numero){
        super();
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = 0;
            this.pessoa = new Cliente(nome, cpf);
        }else {
            System.out.println("Agência e número não devem ser maior que Zero");
            return;
        }
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
    public String dadosConta() {
        String dados = "Agência: "+ this.agencia + " Nº Conta: " + this.numero;
        return dados;
    }
}


