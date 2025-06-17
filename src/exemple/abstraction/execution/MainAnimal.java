package exemple.abstraction.execution;

import exemple.abstraction.base.Animal;
import exemple.abstraction.fils.Chat;
import exemple.abstraction.fils.Chien;

public class MainAnimal {
    public static void main(String[] args) {









        Animal a1 = new Chat("Minou");
        Animal a2 = new Chien("Rex");

        a1.crier();   // Minou miaule : Miaou !
        a2.crier();   // Rex aboie : Wouf !

        a1.dormir();  // Minou dort...
        a2.dormir();  // Rex dort...
    }
}

