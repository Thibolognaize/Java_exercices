public class Main {
    public static void main(String[] args) {
        Voiture vehicule1 = new Voiture("Honda", 5);
        Moto vehicule2 = new Moto("Suzuki", 600);

        vehicule1.demarrer();
        vehicule2.demarrer();
    }
}