package Banco;

public abstract class Conta {
    protected int agencia;
    protected int numero;
    private float saldo;

    public Conta(int agencia, int numero){
        if(agencia > 0 && numero >0){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = 0;
        }else{
            System.out.println("Agência e número devem ser maior que 0");
        }

    }
    public float getSaldo(){
        return this.saldo;
    }
    public abstract void sacar(double valor);

}
