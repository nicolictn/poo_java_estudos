//padrão do nome do pacote: nome do domínio reverso da empresa + nome do projeto + nome do pacote
package screenmatch.br.com.alura.screenmatch.modelos;

//extends = palavra reservada que aplica herança às classes
//lê-se "filme tem e faz tudo do titulo"
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}