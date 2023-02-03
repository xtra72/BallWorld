package org.nhnacademy.ballworld;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Ball Class
 */
public class Ball {
    Point location;
    double radius;
    Color color;

    /**
     * 검정색을 기본을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     */
    public Ball(Point location, double radius) {
        this.location = location;
        this.radius = radius;
        this.color = Color.BLACK;
    }

    /**
     * 지정된 색의 볼을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     * @param color 볼 색
     */
    public Ball(Point location, double radius, Color color) {
        this(location, radius);
        this.color = color;
    }

    /**
     * 볼 위치.
     * @return
     */
    public Point getLocation() {
        return  location;
    }

    /**
     * 볼 반지름.
     * @return
     */
    public double getRadius() {
        return  radius;
    }

    /**
     *
     * @param newColor
     */
    public void setColor(Color newColor) {
        color = newColor;
    }

    /**
     *
     * @return
     */
    public Color getColor() {
        return  color;
    }

    /**
     * 볼 그리기.
     * @param graphics
     */
    public void paint(Graphics graphics) {
        Color oldColor = graphics.getColor();
        graphics.setColor(color);
        graphics.fillOval((int) (location.getX() - getRadius()), (int) (location.getY() - getRadius()),
                (int) (getRadius() * 2), (int) (getRadius() * 2));
        graphics.setColor(oldColor);
    }

}
