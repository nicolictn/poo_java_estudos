package interfaces_exercicios.conversaomoeda;

public class ConversaoMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double dolar) {
        double cotacaoDolar = 5.72;
        double real = dolar * cotacaoDolar;
        System.out.println("Reais: R$" + real);
    }
}
