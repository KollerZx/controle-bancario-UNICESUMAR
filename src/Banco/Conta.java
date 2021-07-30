package Banco;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente pessoa;

    public abstract void sacar(double valor);

    public void depositar(double valor){
        this.saldo += valor;
    }
    public abstract int getAgencia() ;

    public abstract int getNumero() ;

    public abstract void dadosConta();
}
