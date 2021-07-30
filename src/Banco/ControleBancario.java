package Banco;

public class ControleBancario {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Henrique", "08508742012", 12,255854);
        System.out.println("Dados da Conta Corrente:");
        cc.dadosConta();

        System.out.println("---------------------------------------------------------------------------");

        ContaPoupanca cp = new ContaPoupanca("Mariana", "08745612523",25,255540);
        System.out.println("Dados da Conta Poupança:");
        cp.dadosConta();
    }
}
