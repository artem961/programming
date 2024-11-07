package main.java.lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import main.java.lab2.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon p1 = new Bewear("Повариха тётя Надя", 1);

        Pokemon Kulinich = new Bewear("Кулинич", 1);
        battle.addAlly(p1);
        battle.addFoe(Kulinich);
        System.out.println("НАЧИНАЕТСЯ ЗАЩИТА 2 ЛАБАРАТОРКИ");
        battle.go();


    }
}
