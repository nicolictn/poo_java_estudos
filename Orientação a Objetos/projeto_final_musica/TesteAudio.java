package projeto_final_musica;

public class TesteAudio {
    public static void main(String[] args) {
        //instanciando um podcast
        Podcast podcast01 = new Podcast();
        //inserindo informações
        podcast01.setTitulo("Como aprender a programar");
        podcast01.setAutor("Nicoli Caetano");
        podcast01.setDuracao(10); //minutos
        //aplicando metodos
        podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();podcast01.reproduza();
        podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();podcast01.curta();
        System.out.println("---------------------------------------------------------------");
        //exibindo informações gerais
        podcast01.exibaInformacoes();
        podcast01.classificacaoTotal();

        System.out.println("---------------------------------------------------------------");

        //instanciando uma musica
        Musica musica01 = new Musica();
        //inserindo informações
        musica01.setTitulo("G.O.A.T");
        musica01.setAutor("Eric Bellinger & Aroc!");
        musica01.setDuracao(3.4); //minutos
        //aplicando metodos
        musica01.reproduza();
        musica01.curta();
        System.out.println("---------------------------------------------------------------");
        //exibindo informações gerais
        musica01.exibaInformacoes();
        musica01.classificacaoTotal();



    }
}
