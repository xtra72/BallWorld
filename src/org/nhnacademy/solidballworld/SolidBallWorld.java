package org.nhnacademy.solidballworld;

import java.io.InvalidObjectException;


/**
 *
 */
public class SolidBallWorld extends MovableBallWorld {
    /**
     *
     * @param width
     * @param height
     */
    public SolidBallWorld(int width, int height)  {
        super(width, height);
    }

    /**
     *
     * @param ball
     * @throws InvalidObjectException
     */
    public void add(SolidBall solidBall) throws InvalidObjectException {
        if (balls.stream().filter(SolidBall.class::isInstance).anyMatch(ball->((SolidBall)ball).isCollided(solidBall))) {
            throw new InvalidObjectException("공간이 충분하지 않습니다.");
        }

        add((Ball)solidBall);
    }

    /**
     *
     */
    @Override
    public void next() {
        balls.stream().filter(MovableBall.class::isInstance).forEach(ball->{
            ((MovableBall)ball).randomTranslate();
            if ((ball instanceof SolidBall) &&
                (balls.stream().filter(x -> (ball != x) && (x instanceof SolidBall))
                        .anyMatch(x -> ((SolidBall) ball).isCollided((SolidBall) x)))) {
                ((MovableBall)ball).backTranslate();
            }
        });

        repaint();
    }

}
