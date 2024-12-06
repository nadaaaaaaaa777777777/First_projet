
import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    private Set<Departement> departements;
    public DepartementHashSet() {
        departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }


    public boolean rechercherDepartement(String nom) {
        for(Departement e : departements){
            if(e.getNom_departement().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);

    }

    @Override
    public void displayDepartement() {
     for(Departement d: departements){
         System.out.println(d);
     }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedById = new TreeSet<>();
        sortedById.addAll(departements);
        return sortedById;
    }
}
