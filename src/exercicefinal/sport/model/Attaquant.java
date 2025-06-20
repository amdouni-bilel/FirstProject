package exercicefinal.sport.model;

public class Attaquant extends Joueur {
    private double rapidite;

    public Attaquant(int id, String nom, double rapidite) {
        super(id, nom);
        this.rapidite = rapidite;
    }

    public double getRapidite() {
        return rapidite;
    }

    public void setRapidite(double rapidite) {
        this.rapidite = rapidite;
    }

    @Override
    public void jouer() {
        System.out.println("Attaquant " + getNom() + " (ID: " + getId() + ") court à " + rapidite + " m/s pour marquer !");
    }
}