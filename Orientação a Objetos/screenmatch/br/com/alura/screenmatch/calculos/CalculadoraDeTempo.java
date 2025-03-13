package screenmatch.br.com.alura.screenmatch.calculos;

//import
import screenmatch.br.com.alura.screenmatch.modelos.Filme;
import screenmatch.br.com.alura.screenmatch.modelos.Serie;
import screenmatch.br.com.alura.screenmatch.modelos.Titulo;

//CALCULADORA PARA VERIFICAR QUANTO TEMPO DE FILME FOI ASSISTIDO/MARATONA DE FILMES
public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //nesse caso não faz sentido ter um setter, somente um get. Porque quem fará as mudanças será o próprio metodo

//    public void inclui(Filme f) {
//        this.tempoTotal *= f.getDuracaoEmMinutos();
//    }
//
//    //Sobrecarga de metodos = utiliza o mesmo nome, mas passa um parâmetro diferente
//    public void inclui(Serie s) {
//        this.tempoTotal *= s.getDuracaoEmMinutos();
//    }

    //Design de classes = baixo acoplamento, quando não dependem "tanto" entre si
    //POLIMORFISMO
    public void inclui(Titulo titulo){ //usamos como parâmetro a super classe, que contém os filhos FILME e SERIE para evitar código duplicado (os dois acima).
        this.tempoTotal *= titulo.getDuracaoEmMinutos();
    }
}
