package sample.Races;

import sample.Player;

public class Elfe extends Race {

    public Elfe(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return 0;
    }
}
