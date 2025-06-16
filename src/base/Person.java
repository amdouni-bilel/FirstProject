package base;

public class Person {
    private String name;
    private int age;
    public static int totalPersons = 0; // Changé de private à public pour accès direct
    private final int MAX_AGE = 120;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPersons++;

    }

    // Getters et Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= MAX_AGE) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot exceed " + MAX_AGE);
        }
    }

    public void displayInfo() {
        System.out.println(" Name : " + name + " l'age : " + age);
    }

    public static int getTotalPersons() {
        return totalPersons;
    }

    public int getMaxAge() {
        return MAX_AGE;
    }

    public static int a3tiniAkalHaja(int a, int b) {
        if (a < b) {
            return a;
        }else
            return b;
    }
}