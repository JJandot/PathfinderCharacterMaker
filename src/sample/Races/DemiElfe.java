package sample.Races;

import sample.Player;

public class DemiElfe extends Race {

    public DemiElfe(Player player) {
        super(player);
    }

    @Override
    protected int charisme() {
        return 0;
    }
}
