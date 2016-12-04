package sample.Races;

import sample.Player;

public class DemiOrc extends Race {

    public DemiOrc(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return 0;
    }
}
