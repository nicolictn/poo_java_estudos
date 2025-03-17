package heranca.contabancaria;

public class ContaBancaria {
    protected String titular;
    protected String numero;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //depositar
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Titular: " + this.titular + "\nNúmero de conta: " + this.numero);
            System.out.println("Novo saldo: " + this.saldo);
        } else {
            System.out.println("Insira um valor válido.");
        }
    }

    //sacar
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    //consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo disponível para saque:" + getSaldo());
    }
}
