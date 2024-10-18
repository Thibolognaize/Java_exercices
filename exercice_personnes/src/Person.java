public class Person { //Une personne a un nom/prenom/age/sexe/
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private static int nbPerson = 0;
    public Person(){ //Constructeur par défaut
        nbPerson++;
    }

    public Person (String nom, String prenom, int age, String sexe) { //Constructeur parametré
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
        nbPerson++;
    }
    //Affiche notre instance créée
    public void Affiche() {
        System.out.println(this.sexe + " " + this.prenom+ " " + this.nom +" " + this.age + " ans." );
    }
    //Setters and Getters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return this.nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getSexe() {
        return this.sexe;
    }

    //Une méthode sameLastName(Personne p) qui prend en paramètre un deuxième objet de type Personne et qui
    //permet de savoir si les deux personnes ont le même nom de famille.
    public static Boolean sameLastName(Person p1, Person p2) {
        //return p1.nom == p2.nom; => DEPRECIE !!
        return p1.nom.equals(p2.nom); // Comparaison correcte de string
    }
    //Une méthode oldest(Personne p) qui compare la personne appelante avec la personne fournie en paramètre
    //et retourne celle qui est la plus âgée.
    public static Person oldest(Person p1, Person p2) {
        if (p1.age > p2.age) {
            return p1;
        } else {
            return p2;
        }
    }
    //Une méthode afficheNombrePesonnes() qui permet d’afficher le nombre d’objets de type Personne instanciés
    //dans le programme
    public static String afficheNombrePersonnes() {
        return "Vous avez " + nbPerson + " personnes de créée";
    }
}
