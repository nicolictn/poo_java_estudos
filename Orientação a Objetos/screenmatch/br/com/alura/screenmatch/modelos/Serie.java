package screenmatch.br.com.alura.screenmatch.modelos;

//classe filha = serie ; classe mae = titulo
//extends = é um (titulo nesse caso)
public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //Override = sobrescrever metodos, alterar comportamentos da classe mãe
    @Override //ajuda no alerta caso haja modificações no código
    public int getDuracaoEmMinutos() {
        //super classe = mãe -> super.getDuracaoEmMinutos();
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
