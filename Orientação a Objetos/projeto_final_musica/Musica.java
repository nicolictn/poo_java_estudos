package projeto_final_musica;

import projeto_final_musica.calculo.ClassificavelMusica;
import projeto_final_musica.modelo.Audio;

public class Musica extends Audio implements ClassificavelMusica {

    //interface de classificação - contrato
    @Override
    public void classificacaoTotal() {
        if (getTotalCurtidas() < 8) {
            System.out.println("Classificação: As pessoas não escutam muito.");
        } else if (getTotalCurtidas() >= 15 && getTotalCurtidas() <= 25) {
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
