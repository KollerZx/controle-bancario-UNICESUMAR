package Banco;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente pessoa;

    public Conta(int agencia, int numero) throws Exception {
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
        }else{
            throw new Exception("Agência e número devem ser maior que Zero");
        }
    }

    public abstract void sacar(double valor);
    public void depositar(double valor){
        this.saldo += valor;
    }
    public abstract int getAgencia() ;
    public abstract int getNumero() ;
    public abstract double getSaldo();

    public void dadosConta(){
        System.out.println("Nome: " + this.pessoa.getNome());
        System.out.println("CPF: " + this.pessoa.getCpf());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Nº Conta: " + this.getNumero());
        System.out.println("Saldo: R$ "+ this.getSaldo());
    };
}
