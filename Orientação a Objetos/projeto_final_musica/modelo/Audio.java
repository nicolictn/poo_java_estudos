package projeto_final_musica.modelo;

import projeto_final_musica.calculo.ClassificavelMusica;

public class Audio {
    private String titulo; //ok
    private String autor; //ok
    private double duracao; //em min e seg -> //ok
    private int reproducao; //ok
    private int curtida; //ok
    private int totalReproducoes;
    private int totalCurtidas;
//    private ClassificavelMusica classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

//    public ClassificavelMusica getClassificacao() {
//        return classificacao;
//    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    //metodos
    protected void curta() { //ok
        curtida++;
        totalCurtidas += curtida;
        System.out.println("Você deu uma curtida.");
    }

    protected void reproduza() { //ok
        reproducao++;
        totalReproducoes += reproducao;
        System.out.println("Você reproduziu o áudio.");
    }

    public void exibaInformacoes() { //ok
        System.out.println("INFORMAÇÕES SOBRE O ÁUDIO:"); //ok
        System.out.println("Nome: " + getTitulo() + ";" + //ok
                "\nAutor(a): " + getAutor() + ";" + //ok
                "\nDuração: " + getDuracao() + " minutos;" + //ok
                "\nTotal de reproduções: " + getTotalReproducoes() + ";" +
                "\nTotal de curtidas: " + getTotalCurtidas());
    }

}
