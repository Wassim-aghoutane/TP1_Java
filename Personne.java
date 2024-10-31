public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }

    public static void main(String[] args) {
        Personne personne = new Personne("Jean Dupont", 25);
        personne.afficherInfos();
    }
}

