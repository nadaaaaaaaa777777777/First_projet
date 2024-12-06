public class Employe  implements Comparable<Employe>  {
    private int id;
    private String nom;
    private String prenom;
    private String nom_departement;
    private int grade;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public int getGrade() {
        return grade;
    }

    public Employe() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Employe(int id, String nom, String prenom, String nom_departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_departement = nom_departement;
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o instanceof Employe employe) {
            return id == employe.getId() && nom.equals(employe.getNom()); // Compare ID et nom (avec .equals pour les chaînes)
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_departement='" + nom_departement + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public int compareTo(Employe o){
        return this.id-o.id;
    }



}




