package exercicefinal.sport.model;


public class Gardien extends Joueur {
    private double reaction;

    public Gardien(int id, String nom, double reaction) {
        super(id, nom);
        this.reaction = reaction;
    }

    public double getReaction() {
        return reaction;
    }

    public void setReaction(double reaction) {
        this.reaction = reaction;
    }

    @Override
    public void jouer() {
        System.out.println("Gardien " + getNom() + " (ID: " + getId() + ") réagit en " + reaction + " s pour sauver !");
    }
}