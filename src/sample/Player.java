package sample;

import sample.Classes.Classe;
import sample.Races.Race;

public class Player {

    private Race race;
    private Classe classe;
    private int force;
    private int dexterite;
    private int constitution;
    private int intelligence;
    private int sagesse;
    private int charisme;

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDexterite() {
        return dexterite;
    }

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getSagesse() {
        return sagesse;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public int getCharisme() {
        return charisme;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
