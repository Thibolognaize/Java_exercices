public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne();//Appel constructeur
        personne1.setNom("Elbarnoussi");
        personne1.setPrenom("Ayoub");
        personne1.setSexe("Monsieur");
        personne1.setAge(19);

        personne1.Affiche();

        Personne personne2 = new Personne();//Appel constructeur
        personne2.setNom("Stefani");
        personne2.setPrenom("Thomas");
        personne2.setSexe("Madamme");
        personne2.setAge(22);

        personne2.Affiche(); //Affiche instance personne2

        personne1.marier(personne2); //Renvoie message de mariage

        personne1.divorcer(); //Renvoie message de divorce

    }
}
