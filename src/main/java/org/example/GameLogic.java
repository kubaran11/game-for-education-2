package org.example;

import org.example.logic.*;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    private Ball ball;
    private Enemy enemy;
    private ArrayList<Wall> walls;

    public GameLogic() {
        this.ball = null;
        this.walls = new ArrayList<>();
    }

    public void initialize() {

        ball = new Ball(20, 20, "bomb_green.jpg");

        enemy = new Enemy(350,350, "bomb.jpg",100);

        Wall wall1 = new Wall(250, 30, 250, 130, Color.BLACK);
        Wall wall2 = new Wall(100, 50, 150, 50, Color.BLACK);
        walls.add(wall1);
        walls.add(wall2);
    }

    public void update() {
        //ball.move(2, Direction.RIGHT);
        int differenceX = Math.abs(ball.getCoord().x - enemy.getCoord().x);
        int differenceY = Math.abs(ball.getCoord().y - enemy.getCoord().y);

        if (differenceX > differenceY){
            // Direction LEFT, RIGHT
            if (ball.getCoord().x - enemy.getCoord().x > 0) {
                // Direction RIGHT
                enemy.move(1, Direction.RIGHT);
            }
            else {
                // Direction LEFT
                enemy.move(1, Direction.LEFT);
            }
        } else {
            // Direction UP, DOWN
            if (ball.getCoord().y - enemy.getCoord().y > 0){
                // Direction DOWN
                enemy.move(1, Direction.DOWN);
            }
            else {
                // Direction UP
                enemy.move(1, Direction.UP);
            }
        }
        for (Wall wall: walls) {
            if (ball.isCollided(wall.getRectangle())){
                wall.inactivate();
            }
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Ball getBall() {
        return ball;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }
}
