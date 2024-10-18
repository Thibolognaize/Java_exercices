public class Formation {
    private String intitule;
    private Number nbrJours;
    private Stagiaire stagiaires;

    //Construct Formation
    public Formation(String intitule, Number nbrJours, Stagiaire stagiaires[]) {
        this.intitule = intitule;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires[0];
    }
    //Getters et Setters
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public Number getNbrJours() {
        return nbrJours;
    }
    public void setNbrJours(Number nbrJours) {
        this.nbrJours = nbrJours;
    }
    public Stagiaire getStagiaires() {
        return stagiaires;
    }

}
/*
5. Créez la classe Formation, Définissez les getters et setters de ses attributs, et définissez le constructeur
Formation(intitulé: string, nbrJours: number , stagiaires: Stagiaire[] )
6. Ecrivez une méthode calculerMoyenneFormation() qui retourne la moyenne d’un objet de type formation (la
                                                                                                                moyenne des moyennes des stagiaires)
7. Ecrivez une méthode getIndexMax() qui retourne l’indice du stagiaire dans le tableau stagiaires ayant la
meilleure moyenne de la formation.
8. Ecrivez une méthode afficherNomMax() qui affiche le nom du premier stagiaire ayant la meilleure moyenne
d’une formation.
        9. Ecrivez une méthode afficherMinMax() qui affiche la note minimale du premier stagiaire ayant la meilleure
moyenne d’une formation.
        10. Ecrivez une méthode trouverMoyenneParNom(nom: string) qui affiche la moyenne du premier stagiaire dont
le nom est passé en paramètre.
        11. Dans la méthode main(), testez toutes les méthodes réalisées dans les questions précédentes (créez par
example trois objets Stagiaire et affectez les à une même formation et faites appel aux quatre dernières méthodes
que vous avez implémentées)*/