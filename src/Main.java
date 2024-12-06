import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       SocieteArrayList societe = new SocieteArrayList();
       societe.ajouterEmploye(new Employe(1,"benkhaled", "nada","TI",2));
        societe.ajouterEmploye(new Employe(3,"saleh", "M.ali","AI",1));
        societe.ajouterEmploye(new Employe(2,"khaled", "ali","BI",3));
        societe.ajouterEmploye(new Employe(4,"mohamed", "ali","BI",4));
        societe.displayEmploye();
        societe.trierEmployeParId();
        System.out.println("afficher la liste tri par id");
        societe.displayEmploye();
        if(societe.rechercherEmploye("saleh")){
            System.out.println("saleh existe dans la liste ");
        }
        else{
            System.out.println("saleh n'existe pas dans la liste ");
        }
        societe.supprimerEmploye(new Employe(4,"mohamed", "ali","BI",4));
        System.out.println("Avant le tri:");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("Après le tri:");
        societe.displayEmploye();




    }
}