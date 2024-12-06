import java.util.*;

public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        Employe e1 = new Employe(3, "benkhlad", "nour", "TI", 3);
        Employe e2 = new Employe(1, "ali", "nada", "IL", 2);
        Employe e3 = new Employe(2, "nour", "bennour", "ML", 1);
        Departement d1= new Departement(4,"INFO",25);
        Departement d2= new Departement(3,"FIN",15);
        Departement d3= new Departement(2,"Mic",15);
        Departement d4= new Departement(2,"Mic",15);
        Departement d5= new Departement(1,"LL",8);


        System.out.println("affchier le hashset de departement");
        affectationHashMap.ajouterEmployeDepartement(e1, d1);
        affectationHashMap.ajouterEmployeDepartement(e2, d2);
        affectationHashMap.ajouterEmployeDepartement(e3, d3);
        TreeMap<Employe, Departement> sortedMap = affectationHashMap.trierMap();

        for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " - Département: " + entry.getValue().toString());
        }
        if( affectationHashMap.rechercherEmploye(e1)){
            System.out.println("le key existe");
        }else{
            System.out.println("le key n existe pas");
        }
        if( affectationHashMap.rechercherDepartement(d1)){
            System.out.println("le valeur existe");
        }else{
            System.out.println("le valeur n existe pas");
        }
        System.out.println("le affichier key ");
        affectationHashMap.afficherEmployes();
        System.out.println("le affichier valeur ");
        affectationHashMap.afficherDepartements();
        affectationHashMap.supprimerEmploye(e1);
        System.out.println("le vérifier clé key ");
        affectationHashMap.afficherEmployes();


    }









}

