package screenmatch.br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    //private = modificador de acesso que não permite outra classe ler e nem escrever. Para isso, devemos criar um metodo acessor (getter e setter).
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;

    //metodo acessor -> dá somente um acesso, ex: para usuário visualizar uma informação
    //get = pega/obter um valor; set = altera/atribui valor
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDasAvaliacoes() {
        return totalDasAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome + ".");
        System.out.println("Ano de lançamento: " + this.anoDeLancamento + ".");
        System.out.println("Duração em minutos: " + this.duracaoEmMinutos + " minutos.");
        System.out.println("Incluído no plano: " + this.incluidoNoPlano + ".");
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        //incrementa UMA VEZ toda vez que chegar no final do metodo
        totalDasAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
