package sample.Races;

import sample.Player;

public class Halfelin extends Race {

    public Halfelin(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return 0;
    }
}
