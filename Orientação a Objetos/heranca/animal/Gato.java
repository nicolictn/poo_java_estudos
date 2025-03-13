package heranca.animal;

public class Gato extends Animal{

    @Override
    protected void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}
