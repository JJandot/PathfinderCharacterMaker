package sample.Races;

import sample.Player;

public class Nain extends Race {

    public Nain(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return -2;
    }
}
