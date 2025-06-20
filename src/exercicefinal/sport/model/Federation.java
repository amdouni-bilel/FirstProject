package exercicefinal.sport.model;

import exercicefinal.sport.interfaces.InterfaceFederation;

import java.util.Map;



import java.util.HashMap;

public class Federation implements InterfaceFederation {
    private String nom;
    private String pays;
    private int anneeCreation;
    private Map<Tournoi, Stade> planning2025;

    public Federation(String nom, String pays, int anneeCreation) {
        this.nom = nom;
        this.pays = pays;
        this.anneeCreation = anneeCreation;
        this.planning2025 = new HashMap<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public Map<Tournoi, Stade> getPlanning2025() {
        return planning2025;
    }

    public void ajouterTournoi(Stade stade, Tournoi tournoi) {
        planning2025.put(tournoi, stade);
    }

    @Override
    public void afficherPlanning() {
        System.out.println("Fédération: " + nom + ", Pays: " + pays + ", Année de création: " + anneeCreation);
        System.out.println("Planning 2025:");
        for (Map.Entry<Tournoi, Stade> entry : planning2025.entrySet()) {
            System.out.println("Tournoi: " + entry.getKey().getNom() + " à " + entry.getValue().getNom() + ", " + entry.getValue().getVille());
        }
    }
}
