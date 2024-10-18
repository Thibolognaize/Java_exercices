public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person(); //Appel du constructeur
        Person1.setNom("Doe");
        Person1.setPrenom("John");
        Person1.setAge(30);
        Person1.setSexe("Monsieur");

        Person Person2 = new Person("Taite", "Maeva", 34, "Madame");

        //Affiche mes instances
        Person2.Affiche();
        //Appel de la méthode pour checker si same Nom
        Boolean sameLast = Person.sameLastName(Person1, Person2);
        System.out.println("Les deux personnes selectionnées sont de la même famille : " + sameLast);
        // Appel de la méthode oldest pour trouver la personne la plus âgée entre person1 et person2
        Person older = Person.oldest(Person1, Person2);
        System.out.println(older.getPrenom() + " est la personne la plus âgée entre " + Person1.getPrenom() + " et " + Person2.getPrenom() + ".");
        // Appel de la méthode afficheNombrePersonnes
        System.out.println(Person.afficheNombrePersonnes());
        }
}