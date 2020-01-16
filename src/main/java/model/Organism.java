package model;

import java.util.ArrayList;
import java.util.Random;

public class Organism {
    public Organism(int power, int initiative, Position position, World world) {
        this.power = power;
        this.initiative = initiative;
        this.position = position;
        this.world = world;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Position move() {
        ArrayList<Position> fields = world.getNeighbourFields(position);
        if (!fields.isEmpty()) {
            return fields.get(new Random().nextInt(fields.size()));
        }
        return null;
    }


    private int power;
    private int initiative;
    private Position position;
    private World world;
}
