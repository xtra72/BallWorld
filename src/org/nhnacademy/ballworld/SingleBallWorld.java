package org.nhnacademy.ballworld;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Frame;

/**
 *
 */
public class SingleBallWorld extends Frame {
    /**
     *
     */
    Ball    ball;

    /**
     *
     * @param width
     * @param height
     */
    public SingleBallWorld(int width, int height)  {
        super();
        setTitle("Single Ball World");
        setSize(width, height);

        ball = new Ball(new Point(width / 2.0, height / 2.0), Math.min(width, height) / 10, Color.BLUE);
    }

    /**
     *
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        ball.paint(graphics);
    }
}
