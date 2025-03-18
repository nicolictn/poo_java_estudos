package projeto_final_musica;

import projeto_final_musica.calculo.ClassificavelMusica; //interface
import projeto_final_musica.modelo.Audio; //superclasse

public class Podcast extends Audio implements ClassificavelMusica {


    //interface de classificação - contrato
    @Override
    public void classificacaoTotal() {
        if (getTotalCurtidas() < 4) {
            System.out.println("Classificação: As pessoas não escutam muito.");
        } else if (getTotalCurtidas() >= 10 && getTotalCurtidas() <= 20) {
            System.out.println("Classificação: As pessoas escutam moderadamente.");
        } else {;
            System.out.println("Classificação: As pessoas escutam bastante.");
        }
    }

    @Override
    protected void curta() {
        super.curta();
    }

    @Override
    protected void reproduza() {
        super.reproduza();
    }
}
