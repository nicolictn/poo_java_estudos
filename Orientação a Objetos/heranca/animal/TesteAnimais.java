package heranca.animal;

public class TesteAnimais {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("-------------------------------------------------------");

    Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
