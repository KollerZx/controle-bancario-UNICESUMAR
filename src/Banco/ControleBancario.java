package Banco;

public class ControleBancario {
    public static void main(String[] args) {

        System.out.println("CONTA CORRENTE");
        ContaCorrente cc = new ContaCorrente("Henrique", "08508742012", 12,255854);
        cc.dadosConta();

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("CONTA POUPANÇA");
        ContaPoupanca cp = new ContaPoupanca("Mariana", "08745612523",25,255540);
        cp.dadosConta();
    }
}
