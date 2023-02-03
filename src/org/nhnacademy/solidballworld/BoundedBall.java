package org.nhnacademy.solidballworld;

import java.awt.Color;

/**
 * Ball Class
 */
public class BoundedBall extends SolidBall {
    /**
     * 검정색을 기본을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     */
    public BoundedBall(Point location, double radius) {
        super(location, radius);
    }

    /**
     * 지정된 색의 볼을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     * @param color 볼 색
     */
    public BoundedBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }
}
