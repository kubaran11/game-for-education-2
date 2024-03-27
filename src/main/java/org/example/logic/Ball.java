package org.example.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public Ball(int x, int y, String url) {
        this.x = x;
        this.y = y;


        ImageIcon ii = new ImageIcon(getClass().getResource("/" + url));
        this.image = ii.getImage();

        this.width = ii.getIconWidth();
        this.height = ii.getIconHeight();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public boolean isCollided (Rectangle otherObject) {
        Rectangle ballRectangle = new Rectangle(x,y,width, height);
        return ballRectangle.intersects(otherObject);
    }

    public void move(int steps, Direction direction) {
        switch (direction) {
            case LEFT -> {
                this.x -= steps;
            }
            case RIGHT -> {
                this.x += steps;
            }
            case UP -> {
                this.y -= steps;
            }
            case DOWN -> {
                this.y += steps;
            }
        }
    }
}
