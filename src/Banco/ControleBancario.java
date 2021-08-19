package Banco;

public class ControleBancario {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("CONTA CORRENTE:");
            ContaCorrente contaC1 = new ContaCorrente("Henrique", "08508742012", 1,255854);
            contaC1.depositar(50);
            contaC1.sacar(25);
            contaC1.dadosConta();

            System.out.println("---------------------------------------------------------------------------");

            System.out.println("CONTA POUPANÇA:");
            ContaPoupanca contaP1 = new ContaPoupanca("João", "08745612523",25,255540);
            contaP1.depositar(50);
            contaP1.sacar(25);
            contaP1.dadosConta();

            System.out.println("----------------------------------------------------------------------------");

            System.out.println("Criando uma conta corrente com agência = 0");

            // "A instrução abaixo irá entrar na exceção, pois não é permitido criar uma conta com agência ou número igual a 0 (Zero)"
            ContaCorrente contaC2 = new ContaCorrente("Felipe", "07506412535", 0, 354575);
            contaC2.dadosConta();
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}
