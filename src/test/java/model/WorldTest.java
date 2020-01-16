package model;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {


    @org.junit.jupiter.api.Test
    void printWorld() {
        World world = new World(10, 10);
        Position position = new Position(2, 3);
        Organism organism = new Organism(10, 10, position, world);
        world.addOrganism(organism);
        world.printWorld();
        world.ruszDupe();
        world.printWorld();
    }


    @org.junit.jupiter.api.Test
    void positionOnBoard() {
    }

    @org.junit.jupiter.api.Test
    void getNeighbourFields() {
        Position position = new Position(10, 3);
        World world = new World(10, 10);
        world.getNeighbourFields(position);
    }

    @org.junit.jupiter.api.Test
    void ruszDupe() {
        World world = new World(10, 10);
        Position position = new Position(2, 3);
        Organism organism = new Organism(10, 10, position, world);
        world.addOrganism(organism);
        world.ruszDupe();
    }
}