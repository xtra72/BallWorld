package org.nhnacademy.solidballworld;

import java.awt.Color;

/**
 * Ball Class
 */
public class MovableBall extends Ball {

    Point  oldLocation;
    double translateDistance;
    double translateAngle;
    /**
     * 검정색을 기본을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     */
    public MovableBall(Point location, double radius) {
        super(location, radius);
        oldLocation = location;
    }

    /**
     * 지정된 색의 볼을 생성한다.
     * @param location 볼 위치
     * @param radius 볼 반지름
     * @param color 볼 색
     */
    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    /**
     *
     * @param distance
     * @param angle
     */
    public void setDisplacement(double distance, double angle) {
        translateDistance = distance;
        translateAngle = angle;
    }

    /**
     *
     * @return
     */
    public double getTranslateDistance() {
        return  translateDistance;
    }

    /**
     *
     * @return
     */
    public double getTranslateAngle() {
        return  translateAngle;
    }

    /**
     * 주어진 정보만큼 이동한다.
     * @param distance
     * @param angle
     */
    public void translate(double distance, double angle) {
        setDisplacement(distance, angle);
        location.translate(translateDistance, translateAngle);
    }

    /**
     *
     */
    public void translate() {
        oldLocation = new Point(location);
        location.translate(translateDistance, translateAngle);
    }

    /**
     *
     */
    public void randomTranslate() {
        oldLocation = new Point(location);
        location.translate(Math.random() * translateDistance, Math.random() * translateAngle);
    }

    /**
     *
     */
    public void backTranslate() {
        location = oldLocation;
    }
}
