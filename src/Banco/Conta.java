package Banco;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente pessoa;

    public abstract void sacar(double valor);

    protected abstract double getSaldo();

    public abstract String dadosConta();
}
