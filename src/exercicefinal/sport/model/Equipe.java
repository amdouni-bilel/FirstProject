package exercicefinal.sport.model;

import exercicefinal.sport.interfaces.InterfaceEquipe;

import java.util.ArrayList;
import java.util.List;

public class Equipe implements InterfaceEquipe {
    private String nom;
    private List<Joueur> listJoueurs;

    public Equipe(String nom) {
        this.nom = nom;
        this.listJoueurs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Joueur> getListJoueurs() {
        return listJoueurs;
    }

    public void ajouterJoueur(Joueur joueur) {
        listJoueurs.add(joueur);
    }

    @Override
    public void afficherJoueurs() {
        System.out.println("Équipe: " + nom);
        for (Joueur joueur : listJoueurs) {
            joueur.jouer(); // Polymorphisme
        }
    }
}