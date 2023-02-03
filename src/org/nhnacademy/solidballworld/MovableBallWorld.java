package org.nhnacademy.solidballworld;

/**
 *
 */
public class MovableBallWorld extends MultiBallWorld {
    /**
     *
     */
    long timeInterval;

    /**
     *
     * @param width
     * @param height
     */
    public MovableBallWorld(int width, int height)  {
        super(width, height);
        timeInterval = 20;
    }

    /**
     * 단위 시간만큼 이동.
     */
    public void next() {
        balls.stream().filter(MovableBall.class::isInstance).forEach(ball->((MovableBall)ball).randomTranslate());
        repaint();
    }

    /**
     *
     * @param interval
     */
    public void setTimeInterval(long interval) {
        timeInterval = interval;
    }

    /**
     *
     * @return
     */
    public long getTimeInterval() {
        return  timeInterval;
    }
    /**
     *
     * @param seconds
     * @throws InterruptedException
     */
    public void run(int seconds) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        while (System.currentTimeMillis() < startTime + (long) seconds * 1000) {
            next();
            Thread.sleep(timeInterval);
        }
    }
}
