package sample.Classes;

import sample.Player;

public abstract class Classe {

    Player player;
    String description;

    public Classe(Player player) {
        this.player = player;
    }

    public String getDescription() {
        return description;
    }
}
