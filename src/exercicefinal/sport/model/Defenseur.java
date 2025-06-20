package exercicefinal.sport.model;

public class Defenseur extends Joueur {
    private double puissance;

    public Defenseur(int id, String nom, double puissance) {
        super(id, nom);
        this.puissance = puissance;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    @Override
    public void jouer() {
        System.out.println("Défenseur " + getNom() + " (ID: " + getId() + ") bloque avec une puissance de " + puissance + " N.");
    }
}