package org.nhnacademy.movableballworld;

import java.awt.Graphics;
import java.awt.Frame;
import java.util.List;
import java.util.LinkedList;

/**
 *
 */
public class MultiBallWorld extends Frame {
    /**
     *
     */
    List<Ball>    balls;

    /**
     *
     * @param width
     * @param height
     */
    public MultiBallWorld(int width, int height)  {
        setTitle("Multi Ball World");
        setSize(width, height);

        balls = new LinkedList<>();
    }

    /**
     *
     * @param ball
     */
    public void add(Ball ball) {
        balls.add(ball);
    }

    /**
     *
     */
    public int getBallCount() {
        return  balls.size();
    }

    /**
     *
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for(Ball ball : balls) {
            ball.paint(graphics);
        }
    }
}
