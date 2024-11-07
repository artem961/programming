package main.java.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import main.java.lab2.moves.special.ChargeBeam;
import main.java.lab2.moves.special.MoonBlast;
import main.java.lab2.moves.special.EnergyBall;
import main.java.lab2.moves.special.Extrasensory;

public final class TapuBulu extends Pokemon {
    public TapuBulu(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.FAIRY);
        this.setStats(70, 130, 115, 85, 95, 75);
        this.setMove(
                new ChargeBeam(),
                new MoonBlast(),
                new EnergyBall(),
                new Extrasensory());
    }
}
