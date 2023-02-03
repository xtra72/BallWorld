package org.nhnacademy.solidballworld;

import java.awt.Color;

/**
 * SolidBall Class
 */
public class SolidBall extends MovableBall {

    /**
     * 검정색을 기본을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     */
    public SolidBall(Point location, double radius) {
        super(location, radius);
    }

    /**
     * 지정된 색의 볼을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     * @param color 볼 색
     */
    public SolidBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    /**
     *
     * @param point
     * @return
     */
    public boolean contains(Point point) {
        return  location.distanceFrom(point) < radius;
    }

    /**
     *
     * @param anotherBall
     * @return
     */
    public double distanceFrom(SolidBall anotherBall) {
        double distance = location.distanceFrom(anotherBall.getLocation()) - radius - anotherBall.getRadius();
        if (distance > 0) {
            return  distance;
        } else {
            return  0;
        }
    }

    /**
     * SolidBall간 충돌이 발생했는지 확인.
     *
     * @param anotherBall
     * @return
     */
    public boolean isCollided(SolidBall anotherBall) {
        return  distanceFrom(anotherBall) == 0;
    }
}
