package main.java.lab2.pokemons;

import main.java.lab2.moves.special.AcidSpray;
import main.java.lab2.moves.special.ChargeBeam;
import main.java.lab2.moves.status.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eelektrik extends Pokemon {
    public Eelektrik(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(65, 85, 70, 75, 70, 40);
        this.setMove(
                new ChargeBeam(),
                new ThunderWave(),
                new AcidSpray());
    }
}
