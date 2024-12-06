import java.util.Objects;

public class Departement  implements Comparable<Departement>{
    private int id;
    private String nom_departement;
    private int nbemployes;
    public Departement (int id ,String nom_departement,int nbemployes){
        this.id = id;
        this.nom_departement = nom_departement;
        this.nbemployes = nbemployes;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public int getNbemployes() {
        return nbemployes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public void setNbemployes(int nbemployes) {
        this.nbemployes = nbemployes;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o instanceof Departement d) {
            return id == d.getId() && nom_departement.equals(d.getNom_departement()); // Compare ID et nom (avec .equals pour les chaînes)
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nbemployes='" + nbemployes + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom_departement, nbemployes);
    }

    @Override
    public int compareTo(Departement o) {
        return this.id- o.id;
    }

}
