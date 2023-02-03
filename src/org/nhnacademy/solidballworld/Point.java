package org.nhnacademy.solidballworld;

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

    public Point(Point anotherPoint)  {
        this.x = anotherPoint.getX();
        this.y = anotherPoint.getY();
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

    /**
     *
     * @param point
     * @return
     */
    public double distanceFrom(Point point) {
        return  Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
    }

    public void translate(double length, double angle) {
        x += length * Math.cos(Math.toRadians(angle));
        y += length * Math.sin(Math.toRadians(angle));
    }
}
