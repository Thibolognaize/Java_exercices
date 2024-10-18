public class Moto extends Vehicule{
    private int cylindree;

    public Moto(String marque, int cylindree) {
        super(marque);
        this.cylindree = cylindree;
    }
    @Override
    public void demarrer() {
        System.out.println("La moto démarre");
    }
}
