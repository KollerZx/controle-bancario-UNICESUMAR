package Banco;

public class ContaCorrente extends Conta {
    private final double TAXA = 0.10;
    public ContaCorrente(String nome, String cpf, int agencia, int numero) {
        super();
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = 100;
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
    protected double getSaldo() {
        return this.saldo;
    }

    @Override
    public String dadosConta() {
        String dados = "Agência: "+ this.agencia + " Nº Conta: " + this.numero;
        return dados;
    }

    public void cadastro(){
        System.out.println("Nome: "+ this.pessoa.getNome());
        System.out.println("Cpf: "+ this.pessoa.getCpf());
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Numero: " + this.numero);
    }




}