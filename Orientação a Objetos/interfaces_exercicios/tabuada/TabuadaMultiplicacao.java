package interfaces_exercicios.tabuada;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + "x" + i + " = " + multiplicacao);
        }
    }
}
