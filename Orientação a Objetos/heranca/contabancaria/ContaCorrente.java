package heranca.contabancaria;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 8.99;
    private double valorTarifado;

    @Override
    public void consultarSaldo() {
        valorTarifado = getSaldo() - tarifaMensal;
        System.out.println("Saldo disponível para saque: " + valorTarifado);
        System.out.println("Valor da tarifa mensal: " + tarifaMensal);
    }
}
