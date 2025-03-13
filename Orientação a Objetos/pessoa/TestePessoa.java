package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        //instanciando a classe Pessoa para o objeto pessoa01
        Pessoa pessoa01 = new Pessoa();

        //dando valores aos atributos
        pessoa01.cpf = "000.000.000-05";
        pessoa01.nome = "Flávia";
        pessoa01.idade = 25;
        pessoa01.sexo = "mulher";
        pessoa01.nacionalidade = "brasileira";

        pessoa01.fala();
    }
}
