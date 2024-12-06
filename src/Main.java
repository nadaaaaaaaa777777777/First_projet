import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
   DepartementHashSet gestionDepartements = new DepartementHashSet();
        Departement d1= new Departement(4,"INFO",25);
        Departement d2= new Departement(3,"FIN",15);
        Departement d3= new Departement(2,"Mic",15);
        Departement d4= new Departement(2,"Mic",15);
        Departement d5= new Departement(1,"LL",8);
      gestionDepartements.ajouterDepartement(d1);
      gestionDepartements.ajouterDepartement(d2);
      gestionDepartements.ajouterDepartement(d3);
      gestionDepartements.ajouterDepartement(d4);
      gestionDepartements.ajouterDepartement(d5);
      System.out.println("affchier le hashset de departement");
      gestionDepartements.displayDepartement();

      if (gestionDepartements.rechercherDepartement("INFO")){
          System.out.println("le departement existe dans hashset");
      } else {
          System.out.println("le departement n existe pas ");
      }
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();
        System.out.println("tri departement  ");
        TreeSet<Departement> sortedById = gestionDepartements.trierDepartementById();
        for(Departement d : sortedById){
            System.out.println(d);
        }







    }
}