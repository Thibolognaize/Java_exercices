public abstract class Vehicule {
    private String marque;
    public Vehicule(String marque){
        this.marque = marque;
    }

    public abstract void demarrer();
}
