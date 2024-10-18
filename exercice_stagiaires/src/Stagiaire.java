public class Stagiaire {
    private String nom;
    private int[] notes;

    //constructeur avec paramètres
    public Stagiaire(String nom, int[] notes) {
        this.nom = nom;
        this.notes = notes;
    }
    //getters et setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setNotes(int[] notes) {
        this.notes = notes;
    }
    public String getNom() {
        return this.nom;
    }
    public int[] getNotes() {
        return this.notes;
    }
    public double calculerMoyenne(int[] notes) {
        int length = notes.length;
        double moyenne = 0;
        for (int i = 0; i < length; i++) {
            moyenne += notes[i];
            moyenne = moyenne / length;
        }
        return moyenne;
    }
    public double trouverMax() {
        double max = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }
    public double trouverMin() {
        double min = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        return min;
    }
}

