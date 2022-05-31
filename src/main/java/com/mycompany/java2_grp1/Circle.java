/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java2_grp1;

/**
 * this is  the definition of a class that creates a circle and returns the area
 * and circumference of the circle depending on the value of the radius
 *
 * @author Group 1 members:
 *                 1. ICTU20201200  ABDOUL AZIS
 *                  2. ICTU20212183  ACHA Naomi Blanche Eya
 *                  3. ICTU20201493  AKOM, Tikum Donald
 *                  4. ************  AMBELLA FRANCIS NDOFOR
 *                  5. ICTU20201172  ANABA MVOGO BORIS CLOTAIRE
 *                  6. ************  ANIEFIOK CHRISPAT NKWENTI JUNIOR
 *                  7. ************  ANUAFOR BRICE NKWENTI
 *                  8. ICTU20201803  ANZIA JUVIS ANGWERI
 *                  9. ICTU20201589  ASONGANYI TINTINU
 *                  10.ICTU20201722  AWASUM PRECIOUS MUA-WALLANG
 *                  11.ICTU20212488  MUDOH CHRIS AGWO
 */
public class Circle {
    private double radius = 1.0;
    private String Color = "red";
    private String group = "1 to 4";
    protected double pi = 3.14159265359;

    /**
     * Circle default constructor
     */
    public Circle() {
    }

    /**
     * Circle constructor
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle constructor
     * @param radius
     * @param color
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    /**
     * Circle constructor
      * @param radius
     * @param color
     * @param group
     */
    public Circle(double radius, String color, String group) {
        this.radius = radius;
        Color = color;
        this.group = group;
    }

    /**
     *
     * @return the area of the circle
     */
    public double getArea(){
        double area = this.radius*this.radius*pi;
        return area;
    }

    /**
     *
     * @return the circumference of the Circle
     */
    public double getCircumference(){
        double area = 2*this.radius*pi;
        return area;
    }

    /**
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * sets the radius of the circle
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     *
     * @return Color of the circle
     */
    public String getColor() {
        return Color;
    }


    /**
     * sets the color of the circle
     * @param color
     */
    public void setColor(String color) {
        Color = color;
    }

    /**
     *
     * @return Group of students who did the work
     */
    public String getGroup() {
        return group;
    }

    /**
     * sets the group of the dtudents who did the work
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }
}
