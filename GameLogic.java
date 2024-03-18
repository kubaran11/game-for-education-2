import logic.Ball;
import logic.Direction;

import java.awt.*;

public class GameLogic {
    private Ball ball;
    private Ball ballEnemy;

    public GameLogic() {
        this.ball = null;
    }

    public void initialize() {
        ball = new Ball(20, 20, 50, 50, Color.BLUE);
    }

    public void update() {
        ball.move(2, Direction.RIGHT);
    }

    public Ball getBall() {
        return ball;
    }

}
