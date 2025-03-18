package interfaces_exercicios.temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double fahrenheit = (temperatura * 1.8) + 32;
        System.out.println(temperatura + "ºF equivalem a " + fahrenheit + "ºC");

    }

    @Override
    public void fahrenheitParaCelsius(double temperatura) {
        double celsius = ((temperatura - 32) / 9) * 5;
        System.out.println(temperatura + "ºF equivalem a " + celsius + "ºC");
    }
}
