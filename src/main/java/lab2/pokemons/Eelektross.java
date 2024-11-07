package main.java.lab2.pokemons;

import main.java.lab2.moves.special.AcidSpray;
import main.java.lab2.moves.special.Acid;
import main.java.lab2.moves.special.ChargeBeam;
import main.java.lab2.moves.status.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public final class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(85, 115, 80, 105, 80, 50);
        this.setMove(
                new ChargeBeam(),
                new ThunderWave(),
                new AcidSpray(),
                new Acid());
    }
}
