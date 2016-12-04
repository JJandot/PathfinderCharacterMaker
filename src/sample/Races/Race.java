package sample.Races;

import sample.Player;

public abstract class Race {

    private String description;
    private Player player;

    public Race(Player player) {
        this.player = player;
        modCarac();
    }

    private void modCarac(){
        player.setCharisme(player.getCharisme() + charisme());
    }

    public String getDescription() {
        return description;
    }

    protected abstract int charisme();
}
