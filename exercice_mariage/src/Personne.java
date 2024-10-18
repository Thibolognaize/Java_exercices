public class Personne {
    private String nom;
    private String prenom;
    private String sexe;
    private int age;
    private Personne conjoint;
    public Personne () {}
    //Constructeur

    /*
    public Personne(String nom, String prenom, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.conjoint = null;
    }*/

    //liste de setters
    public void setNom (String nom) {
        this.nom = nom;
    }
    public void setPrenom (String prenom) {
        this.prenom = prenom;
    }
    public void setSexe (String sexe) {
        this.sexe = sexe;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setConjoint (Personne conjoint) {
        this.conjoint = conjoint;
    }
    //liste de getter
    public String getNom () {
        return this.nom;
    }
    public String getPrenom () {
        return this.prenom;
    }
    public String getSexe () {
        return this.sexe;
    }
    public int getAge () {
        return this.age;
    }
    public Personne getConjoint () {
        return this.conjoint;
    }
    public void Affiche() {
        System.out.println(this.sexe + " " + this.prenom+ " " + this.nom +" " + this.age + " ans.");
    }

    public void marier(Personne autre) {
        // Verification des papiers
        if (this.conjoint != null) {
            System.out.println(this.nom + " est déjà marié.");
            return;
        }
        if (autre.conjoint != null) {
            System.out.println(this.nom + " est déjà marié(e).");
            return;
        }
        if (this.sexe.equals(autre.sexe)) {
            System.out.println("Le mariage n'est pas possible entre deux personnes du même sexe.(Manque d'ouverture d'esprit)");
            return;
        }
        //Faire le mariage si les trois conditions sont évitées
        this.conjoint = autre; //Attribue premier conjoint
        autre.conjoint = this; //Attribue second conjoint
        System.out.println(this.prenom + " et " + autre.prenom + " sont maintenant mariés! Yaaaay");
    }
    public void divorcer() {
        String conjointName = this.getConjoint().prenom;
        if (this.conjoint != null) {
            Personne conjoint1 = this.getConjoint();
            conjoint1.setConjoint(null);
            this.setConjoint(null);
            System.out.println("Oh non ! " + this.prenom + " vient de divorcer ... :,( " + conjointName + " n'était pas assez bon au lit !");
        }
    }
    public Boolean isMaried() {
        return this.conjoint != null;
    }
}
/*
            U M L : Diagrame de classe
        +--------------------------------+
        |             Personne           |
        +--------------------------------+
        | - nom : String                 |
        | - prénom : String              |
        | - sexe : String                |
        | - conjoint : Personne          |
        +--------------------------------+
        | + marier(Personne) : void      |
        | + divorcer() : void            |
        | + isMaried() : boolean         |
        | + getConjoint() : Personne     |
        +--------------------------------+

Personne 1 --------marriage------ 0..1 Personne
*/

