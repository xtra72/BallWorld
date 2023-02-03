package org.nhnacademy.ballworld;

/**
 * Point Class
 */
public class Point {
    /**
     *
     */
    double x;

    /**
     *
     */
    double y;

    /**
     *
     * @param x
     * @param y
     */
    public Point(double x, double y)  {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return
     */
    public double getX() {
        return  this.x;
    }

    /**
     *
     * @return
     */
    public double getY() {
        return  this.y;
    }
}
