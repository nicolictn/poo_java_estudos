package interfaces_exercicios.calculadora;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é de: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (altura + largura) * 2;
        System.out.println("O perímetro da sala retangular é de: " + perimetro);
    }
}
