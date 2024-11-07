package main.java.lab2.pokemons;


import main.java.lab2.moves.physical.DoubleEdge;
import main.java.lab2.moves.physical.RockSlide;
import main.java.lab2.moves.physical.ShadowClaw;
import main.java.lab2.moves.status.Rest;
import ru.ifmo.se.pokemon.Type;

public class Bewear extends Stufful{
    public Bewear(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FIGHTING);
        this.setStats(120, 125, 80, 55, 60, 60);
        this.setMove(
                new RockSlide(),
                new Rest(),
                new DoubleEdge(),
                new ShadowClaw());

    }
}
