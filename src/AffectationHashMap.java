import java.util.*;
import java.util.Iterator;
public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (HashMap.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey().toString() + " - Département: " + entry.getValue().toString());

        }
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void supprimerEmploye(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.containsValue(d)) {
            affectations.remove(e);
        }
    }

    public void afficherDepartements() {
        Collection<Departement> values = affectations.values();
        Iterator<Departement> valueIterator = values.iterator();
        while (valueIterator.hasNext()) {
            System.out.println("Value: " + valueIterator.next());
        }
    }

    public void afficherEmployes() {
        Set<Employe> keys = affectations.keySet();
        Iterator<Employe> keyIterator = keys.iterator();
        while (keyIterator.hasNext()) {
            System.out.println("Key: " + keyIterator.next());
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement D) {
        return affectations.containsValue(D);
    }

    public TreeMap<Employe, Departement> trierMap() {
        Comparator<Employe> comparator = Comparator.comparingInt(Employe::getId);
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}

