package screenmatch;

//é necessário fazer o import dos pacotes para acessar os dados
import screenmatch.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import screenmatch.br.com.alura.screenmatch.modelos.Episodio;
import screenmatch.br.com.alura.screenmatch.modelos.Filme;
import screenmatch.br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //instanciando um objeto
        Filme filme1 = new Filme();

        filme1.setNome("Encantados");
        filme1.setAnoDeLancamento(2008);
        filme1.setDuracaoEmMinutos(180);
        filme1.avalia(8);
        filme1.avalia(4);
        filme1.avalia(3);

        //apresentar mais informações.
        filme1.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + filme1.getTotalDasAvaliacoes());
        System.out.println("Média de avaliações do filme: " + filme1.pegaMedia() + ".");
        System.out.println("-------------------------------------------------------------------");

        System.out.println("-------------------------------------");

        //SERIE
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        //FILME
        //instanciando um objeto
        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        System.out.println("-------------------------------------");

        //CALCULADORA PARA VERIFICAR QUANTO TEMPO DE FILME FOI ASSISTIDO
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("-------------------------------------");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        System.out.println("-------------------------------------");

        Episodio episodio01 = new Episodio();
        episodio01.setNumero(1);
        episodio01.setSerie(lost);
        episodio01.setTotalVisualizacoes(300);
        filtro.filtra((episodio01));
    }
}
