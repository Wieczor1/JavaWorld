package model;

import java.util.ArrayList;

public class World {
    private ArrayList<Organism> organisms;
    private int worldX;
    private int worldY;

    public World(int worldX, int worldY) {
        this.organisms = new ArrayList<>();
        this.worldX = worldX;
        this.worldY = worldY;
    }


    public void addOrganism(Organism o) {
        organisms.add(o);
    }

    public void printWorld() {
        for (int i = 0; i < worldX; i++) {
            for (int j = 0; j < worldY; j++) {
                if (i == organisms.get(0).getPosition().getX() && j == organisms.get(0).getPosition().getY()) {
                    System.out.print("O");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

    }

    public boolean positionOnBoard(Position position) {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() < this.worldX && position.getY() < this.worldY;
    }

    public ArrayList<Position> getNeighbourFields(Position position) {
        ArrayList<Position> allPositions = new ArrayList<>();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                allPositions.add(new Position(i, j));
            }
        }

        for (Position p : allPositions) {
            p.setX(p.getX() + position.getX());
            p.setY(p.getY() + position.getY());

        }
        allPositions.removeIf(p -> !positionOnBoard(p));
        return allPositions;
    }


    public void ruszDupe() {
        for (Organism o : organisms) {
            Position positionBefore = o.getPosition();
            System.out.println(o.getPosition());
            o.setPosition(o.move());
            System.out.println(o.getPosition());
        }
    }
}
