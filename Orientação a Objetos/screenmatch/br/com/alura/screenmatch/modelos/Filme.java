//padrão do nome do pacote: nome do domínio reverso da empresa + nome do projeto + nome do pacote
package screenmatch.br.com.alura.screenmatch.modelos;

import screenmatch.br.com.alura.screenmatch.calculos.Classificavel;

//extends = palavra reservada que aplica herança às classes
//lê-se "filme tem e faz tudo do titulo"
//implements = implementa o classificavel
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //implementação do metodo da interface Classificavel
    //trabalha com polimorfismo
    @Override
    public int getClassificacao() {
        //(int) = caisting
        return (int) pegaMedia() / 2;
    }
}