package org.example.logic;

import java.awt.*;

public class Wall {
    private Coordinates coordStart;
    private Coordinates coordEnd;
    private Color color;

    public Wall(int x1, int y1, int x2, int y2, Color color) {
        this.color = color;
        this.coordStart = new Coordinates(x1, y1);
        this.coordEnd = new Coordinates(x2, y2);
    }

    public Coordinates getCoordStart() {
        return coordStart;
    }

    public Coordinates getCoordEnd() {
        return coordEnd;
    }

    public Color getColor() {
        return color;
    }
}
