package musica;

public class TesteMusica {
    public static void main(String[] args) {
        //criando objeto/instancia
        Musica musica01 = new Musica();

        musica01.titulo = "Lisboa";
        musica01.artista = "AnaVitória";
        musica01.anoLancamento = "2023";
        musica01.avalia(8);
        musica01.avalia(9);
        musica01.avalia(10);

        musica01.exibeFichaTecnica();
        System.out.println(musica01.calculaMedia());
    }
}
