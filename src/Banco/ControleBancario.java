package Banco;

public class ControleBancario {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Henrique", "08508742012", 12,25540);
        cc.sacar(25);
    }
}
