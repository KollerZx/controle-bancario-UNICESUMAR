package Banco;

public class ControleBancario {
    public static void main(String[] args) {

        ContaCorrente cc;
        cc = new ContaCorrente("Henrique", "08508742012", 12,255854);
        //cc.cadastro();
        //ContaPoupanca cp = new ContaPoupanca("Mariana", "08745612523",0,25554);
        //System.out.println(cc.dadosConta());
        System.out.println("Saldo atual: "+ cc.getSaldo());
        cc.sacar(100.00);
        System.out.println("Saldo apos saque: " + cc.getSaldo());
    }
}
