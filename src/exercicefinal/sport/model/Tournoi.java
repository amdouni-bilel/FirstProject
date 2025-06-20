package exercicefinal.sport.model;

import exercicefinal.sport.interfaces.InterfaceTournoi;

import java.util.Set;



import java.util.HashSet;


public class Tournoi implements InterfaceTournoi {
    private String nom;
    private Set<Equipe> setEquipes;

    public Tournoi(String nom) {
        this.nom = nom;
        this.setEquipes = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Equipe> getSetEquipes() {
        return setEquipes;
    }

    public void ajouterEquipe(Equipe equipe) {
        setEquipes.add(equipe);
    }

    @Override
    public void afficherEquipes() {
        System.out.println("Tournoi: " + nom);
        for (Equipe equipe : setEquipes) {
            equipe.afficherJoueurs();
            System.out.println("---");
        }
    }
}