package main.java.lab2.pokemons;

import main.java.lab2.moves.physical.DoubleEdge;
import main.java.lab2.moves.physical.RockSlide;
import main.java.lab2.moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stufful extends Pokemon {
    public Stufful(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FIGHTING);
        this.setStats(70, 75, 50, 45, 50, 50);
        this.setMove(
                new RockSlide(),
                new Rest(),
                new DoubleEdge());

    }
}
