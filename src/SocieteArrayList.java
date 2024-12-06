import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes ;

    public SocieteArrayList(){
        listeEmployes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe t) {
        listeEmployes.add(t);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe e : listeEmployes){
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return  listeEmployes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        listeEmployes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for(Employe e : listeEmployes){
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(Employe::getNom_departement)
                .thenComparingInt(Employe::getGrade));
    }


}
