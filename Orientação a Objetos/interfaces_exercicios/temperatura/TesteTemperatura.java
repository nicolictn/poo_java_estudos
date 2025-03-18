package interfaces_exercicios.temperatura;

public class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();

        //parametro em fahrenheit
        temperatura.fahrenheitParaCelsius(104);

        //parametro em celsius
        temperatura.celsiusParaFahrenheit(40);
    }
}
