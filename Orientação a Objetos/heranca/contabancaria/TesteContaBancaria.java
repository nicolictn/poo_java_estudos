package heranca.contabancaria;


public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setTitular("André Miguel");
        conta01.setNumero("123.123.123.546");
        conta01.depositar(6000);
        conta01.sacar(500);
        conta01.consultarSaldo();

        System.out.println("----------------------------------");

        ContaCorrente contaCorrente01 = new ContaCorrente();
        contaCorrente01.setTitular("Ellen Gabrielly");
        contaCorrente01.setNumero("123.123.123.546");
        contaCorrente01.depositar(6000);
        contaCorrente01.sacar(500);
        contaCorrente01.consultarSaldo();
    }
}
