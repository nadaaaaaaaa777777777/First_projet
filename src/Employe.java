public class Employe {
    private int id;
    private String nom;
    private int prenom;
    private String nom_departement;
    private int grade;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrenom() {
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

    public void setPrenom(int prenom) {
        this.prenom = prenom;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Employe(int id, String nom, int prenom, String nom_departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_departement = nom_departement;
        this.grade = grade;
    }

    public boolean isequals(Object o) {
        if (null == o) return false;
        if (o instanceof Employe employe) {
            return id == employe.getId() && nom == employe.getNom();
        }
        return  false;
    }

    String tostring(){
        return this.nom+" "+this.prenom+" "+this.nom_departement+" "+this.grade;
    }
}




