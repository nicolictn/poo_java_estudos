package heranca.animal;

public class Cachorro extends Animal{

    @Override
    protected void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }
}
