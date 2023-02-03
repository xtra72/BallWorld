package test;

import java.util.Random;
import java.awt.Color;
import java.io.InvalidObjectException;
import java.lang.System.Logger;

import org.nhnacademy.solidballworld.SolidBall;
import org.nhnacademy.solidballworld.SolidBallWorld;
import org.nhnacademy.solidballworld.Point;

public class TestSolidBallWorld {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = System.getLogger("Test Solid Ball World");

        final Color [] colors = { Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.PINK };
        final SolidBallWorld ballWorld = new SolidBallWorld(500, 400);

        ballWorld.setVisible(true);

        Random random = new Random();
        while(ballWorld.getBallCount() < 10) {
            try {
                double radius = 10.0 + random.nextInt(Math.min(ballWorld.getWidth(), ballWorld.getHeight()) / 10);
                Point location = new Point(radius + random.nextInt((int) Math.round(ballWorld.getWidth() - 2 * radius)),
                    radius + random.nextInt((int) Math.round(ballWorld.getHeight() - 2 * radius)));

                SolidBall ball = new SolidBall(location, radius, colors[random.nextInt(colors.length)]);
                ball.setDisplacement(50, 360);
                ballWorld.add( ball );
            } catch(InvalidObjectException e) {
                logger.log(Logger.Level.WARNING, e.toString());
            }
        }

        ballWorld.repaint();

        ballWorld.run(1000);
    }
}
