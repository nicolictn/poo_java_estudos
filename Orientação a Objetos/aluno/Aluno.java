package aluno;

public class Aluno {
    public String nome;
    public int idade;

    public void exibeInformacoes(){
        System.out.println("Nome do aluno: " + this.nome + ".");
        System.out.println("Idade: " + this.idade + " anos.");
    }
}
