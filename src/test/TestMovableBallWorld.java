package test;

import java.util.Random;
import java.awt.Color;

import org.nhnacademy.movableballworld.MovableBall;
import org.nhnacademy.movableballworld.MovableBallWorld;
import org.nhnacademy.movableballworld.Point;

public class TestMovableBallWorld {
    public static void main(String[] args) throws InterruptedException {
        final Color [] colors = { Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.PINK };
        final MovableBallWorld ballWorld = new MovableBallWorld(500, 400);

        ballWorld.setVisible(true);

        Random random = new Random();
        while(ballWorld.getBallCount() < 10) {
            double radius = 10.0 + random.nextInt(Math.min(ballWorld.getWidth(), ballWorld.getHeight()) / 10);
            double locationX = radius + random.nextInt((int) Math.round(ballWorld.getWidth() - 2 * radius));
            double locationY = radius + random.nextInt((int) Math.round(ballWorld.getHeight() - 2 * radius));
            Point location = new Point(locationX, locationY);

            MovableBall ball = new MovableBall(location, radius, colors[random.nextInt(colors.length)]);
            ball.setDisplacement(10, 45);
            ballWorld.add( ball);
        }

        ballWorld.run(200);
    }
}
