package main.java.lab2.pokemons;

import main.java.lab2.moves.special.ChargeBeam;
import main.java.lab2.moves.status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Tynamo extends Pokemon {
    public Tynamo(String name, int level){
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(35, 55, 40, 45, 40 ,60);
        this.setMove(
                new ChargeBeam(),
                new ThunderWave());
    }
}
