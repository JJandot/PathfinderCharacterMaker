package sample.Races;

import sample.Player;

public class Humain extends Race {

    public Humain(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return 0;
    }
}
