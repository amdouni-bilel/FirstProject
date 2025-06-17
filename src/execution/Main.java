package execution;

//import fils.Student;
import fils.Student;
import fils.Teacher;
import base.Person;

public class Main {


//    -------Exemple surcharge : Overloading--------
    public static int somme(int a, int b) {
        return a + b ;
    }
    public static int somme(int a, int b , int c) {
        return a + b + c ;
    }
    public int somme(int a, int b , int c , int d) {
        return a + b + c + d ;
    }
//    -------Exemple surcharge : Overloading--------

    public static void main(String[] args) {
        System.out.println("=== Exécution du programme Exemple surcharge : Overloading ===");
        Main m = new Main();
        System.out.println(somme(5, 10));
        System.out.println(somme(5, 10 , 6));
        System.out.println(m.somme(5, 10 , 6 , 8));
        System.out.println("=== Exécution du programme Exemple surcharge : Overloading ===");


        Person p = new Student("Ali" , 22 , "1234AB" , 5.5);
        p.parle();
        // Appel direct à la variable static totalPersons
        System.out.println("Nombre total de personnes avant création : " + Person.totalPersons);

        // Création d'un tableau de Person
        Person[] persons = new Person[4];

        // Ajout d'étudiants et d'enseignants au tableau
        persons[0] = new Student("Ahmed", 20, "12345", 18.5);
        persons[1] = new Student("Sara", 19, "67890", 15.0);
        persons[2] = new Teacher("Hamadi", 40, "INFO", 10);
        persons[3] = new Teacher("Fatima", 35, "MATH", 8);

        // Affichage des informations de toutes les personnes
        System.out.println("\n=== Affichage des informations de toutes les personnes ===");

        System.out.println("\nPersonne 1:");
        persons[0].displayInfo();
        ((Student) persons[0]).displayInfoStudent();

        System.out.println("\nPersonne 2:");
        persons[1].displayInfo();
        ((Student) persons[1]).displayInfoStudent();

        System.out.println("\nPersonne 3:");
        persons[2].displayInfo();
        ((Teacher) persons[2]).displayInfoTeacher();

        System.out.println("\nPersonne 4:");
        persons[3].displayInfo();
        ((Teacher) persons[3]).displayInfoTeacher();

        // Modification de quelques attributs
        persons[0].setName("vvvvv");
        persons[2].setAge(35);

        // Affichage après modifications
        System.out.println("\n=== Après modification du nom de l'étudiant 1 et de l'âge de l'enseignant 1 ===");

        System.out.println("\nPersonne 1:");
        persons[0].displayInfo();
        ((Student) persons[0]).displayInfoStudent();

        System.out.println("\nPersonne 2:");
        persons[1].displayInfo();
        ((Student) persons[1]).displayInfoStudent();

        System.out.println("\nPersonne 3:");
        persons[2].displayInfo();
        ((Teacher) persons[2]).displayInfoTeacher();

        System.out.println("\nPersonne 4:");
        persons[3].displayInfo();
        ((Teacher) persons[3]).displayInfoTeacher();

        // Affichage via getters pour la première personne (étudiant)
        System.out.println("\n=== Vérification via getters pour l'étudiant 1 ===");
        Student etudiant = (Student) persons[0];
        System.out.println("Nom : " + etudiant.getName());
        System.out.println("ID : " + etudiant.getStudentId());
        System.out.println("Moyenne : " + etudiant.getAverageScore());
        System.out.println("Age : " + etudiant.getAge());
        System.out.println("Âge maximum autorisé : " + etudiant.getMaxAge());

        // Affichage via getters pour le premier enseignant
        System.out.println("\n=== Vérification via getters pour l'enseignant 1 ===");
        Teacher enseignant = (Teacher) persons[2];
        System.out.println("Nom : " + enseignant.getName());
        System.out.println("Âge : " + enseignant.getAge());
        System.out.println("Spécialité : " + enseignant.getCourseName());
        System.out.println("Années d'expérience : " + enseignant.getYearsOfExperience());
        System.out.println("Âge maximum autorisé : " + enseignant.getMaxAge());

        // Appel direct à la variable static totalPersons après création
        System.out.println("\nNombre total de personnes créées : " + Person.totalPersons);

        System.out.println("Variable Min = " + Person.a3tiniAkalHaja(5, 10));
    }
}