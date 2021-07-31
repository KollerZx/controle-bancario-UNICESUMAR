package Banco;

public class ControleBancario {
    public static void main(String[] args) throws Exception {
        try {
            ContaCorrente cc = new ContaCorrente("Henrique", "08508742012", 1,255854);
            System.out.println("Dados da Conta Corrente:");
            cc.dadosConta();

            System.out.println("---------------------------------------------------------------------------");

            ContaPoupanca cp = new ContaPoupanca("Mariana", "08745612523",0,255540);
            System.out.println("Dados da Conta Poupança:");
            cp.dadosConta();
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}
