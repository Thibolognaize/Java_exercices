public class Voiture extends Vehicule{
    private int nombrePortes;

    public Voiture(String marque, int nombrePortes) {
        super(marque);
        this.nombrePortes = nombrePortes;
    }
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }
}
