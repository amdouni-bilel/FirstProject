package exercicefinal.sport.main;


import exercicefinal.sport.model.*;

public class MainExerciceFinal {
    public static void main(String[] args) {
        // 1. Créer des joueurs de chaque type
        Attaquant attaquant = new Attaquant(1, "Lionel", 10.5);
        Defenseur defenseur = new Defenseur(2, "Sergio", 800.0);
        Gardien gardien = new Gardien(3, "Manuel", 0.2);

        // 2. Créer 2 équipes et y ajouter les joueurs
        Equipe equipe1 = new Equipe("Équipe A");
        equipe1.ajouterJoueur(attaquant);
        equipe1.ajouterJoueur(defenseur);
        equipe1.ajouterJoueur(gardien);

        Equipe equipe2 = new Equipe("Équipe B");
        equipe2.ajouterJoueur(new Attaquant(4, "Kylian", 11.0));
        equipe2.ajouterJoueur(new Defenseur(5, "Virgil", 850.0));
        equipe2.ajouterJoueur(new Gardien(6, "Alisson", 0.18));

        // 3. Créer un tournoi et y ajouter les équipes
        Tournoi tournoi = new Tournoi("Coupe 2025");
        tournoi.ajouterEquipe(equipe1);
        tournoi.ajouterEquipe(equipe2);

        // 4. Créer un stade
        Stade stade = new Stade("Stade de France", "Paris");

        // 5. Créer une fédération, associer le tournoi au stade
        Federation federation = new Federation("UEFA", "Europe", 1954);
        federation.ajouterTournoi(stade, tournoi);

        // 6. Appeler les méthodes d’affichage
        federation.afficherPlanning();
        System.out.println("\nDétails des équipes et joueurs:");
        tournoi.afficherEquipes();
    }
}