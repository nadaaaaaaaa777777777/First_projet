public interface IGestion<Employe> {
    public void ajouterEmploye(Employe t);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(Employe t);
    public void supprimerEmploye(Employe t);
    public void displayEmploye();
    public void trierEmployeParId();
    public void trierEmployeParNomDépartementEtGrade();
}
