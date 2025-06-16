package tableau;


public class ExerciceTableau {
    int id;
    String[] listeNoms;
    int[] listeNotes;

    public static void main(String[] args) {
        // Création d'une instance de la classe
        ExerciceTableau exercice = new ExerciceTableau();
        exercice.listeNoms = new String[]{"Ali", "Sami", "Mouna"};
        exercice.listeNotes = new int[]{14, 17, 13};

        // Affichage avec boucle (tableau des notes)
        System.out.println("\n=== Affichage du tableau des notes ===");
        for (int i = 0; i < exercice.listeNotes.length; i++) {
            System.out.println("Note " + (i + 1) + ": " + exercice.listeNotes[i]);
        }

        // Affichage avec boucle (tableau des noms)
        System.out.println("\n=== Affichage du tableau des noms ===");
        for (int i = 0; i < exercice.listeNoms.length; i++) {
            System.out.println("Nom " + (i + 1) + ": " + exercice.listeNoms[i]);
        }

        // Affichage combiné (Nom + Note)
        System.out.println("\n=== Affichage combiné nom et note ===");
        for (int i = 0; i < exercice.listeNoms.length; i++) {
            System.out.println("Nom: " + exercice.listeNoms[i] + " - Note: " + exercice.listeNotes[i]);
        }

        //        // Affichage direct (accès manuel aux éléments)
        System.out.println("=== Affichage manuel ===");
        System.out.println("Nom: " + exercice.listeNoms[0] + " - Note: " + exercice.listeNotes[0]);
        System.out.println("Nom: " + exercice.listeNoms[1] + " - Note: " + exercice.listeNotes[1]);
        System.out.println("Nom: " + exercice.listeNoms[2] + " - Note: " + exercice.listeNotes[2]);


    }
}




