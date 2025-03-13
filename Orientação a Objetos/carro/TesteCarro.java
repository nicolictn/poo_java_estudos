package carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.modelo = "Fusca";
        carro01.cor = "Vermelho";
        carro01.ano = 2013;

        carro01.exibeFichaTecnica();
        System.out.println("A idade do carro é: "+ carro01.calculaIdade() + ".");
    }
}
