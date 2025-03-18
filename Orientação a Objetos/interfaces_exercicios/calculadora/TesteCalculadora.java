package interfaces_exercicios.calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5,6);
        calculadora.calcularPerimetro(8,9);
    }
}
