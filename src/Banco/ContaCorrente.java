package Banco;

public class ContaCorrente extends Conta {
    private final double TAXA = 0.10;
    public ContaCorrente(String nome, String cpf, int agencia, int numero) {
        super();
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = 0;
            this.pessoa = new Cliente(nome, cpf);
        }else {
            System.out.println("Agência e número devem ser maior que Zero");
            return;
        }

    }

    @Override
    public void sacar(double valor) {
        valor += TAXA;
        if(valor <= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Não foi possivel realizar o saque!");
            System.out.println("Valor de saque é superior ao saldo em conta");
            System.out.println("OBS: Ao sacar levar em consideração valor da taxa de R$ 0.10 por saque");
        }
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public int getAgencia() {
        return this.agencia;
    }

    @Override
    public int getNumero() {
        return this.numero;
    }

    @Override
    public void dadosConta() {
        System.out.println("Nome: " + this.pessoa.getNome());
        System.out.println("CPF: " + this.pessoa.getCpf());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Nº Conta: " + this.getNumero());
        System.out.println("Saldo: R$ "+ this.getSaldo());
    }






}