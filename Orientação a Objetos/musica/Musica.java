package musica;

public class Musica {
    public String titulo;
    public String artista;
    public String anoLancamento;
    public double avaliacao;
    public int numAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Título da música: " + this.titulo + ".");
        System.out.println("Artista: " + this.artista + ".");
        System.out.println("Ano de lançamento: " + this.anoLancamento + ".");
    }

    public void avalia(double nota) {
        //avaliacao = avaliacao + nota;
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double calculaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
