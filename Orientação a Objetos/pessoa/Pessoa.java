package pessoa;

public class Pessoa {
    public String cpf;
    public String nome;
    public int idade;
    public String sexo;
    public String nacionalidade;

    void fala() {
        System.out.println("Olá, mundo!\nMe chamo " + nome + ", tenho " + idade + " anos. Sou " + sexo + " " + nacionalidade + ". Meu CPF é o " + cpf + ".");
    }
}
