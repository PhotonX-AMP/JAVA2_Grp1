/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java2_grp1;

/**
 *
 * @author ACER
 */
public class Circle {
    private double radius = 1.0;
    private String Color = "red";
    private String group = "1 to 4";
    protected double pi = 3.14159265359;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    public Circle(double radius, String color, String group) {
        this.radius = radius;
        Color = color;
        this.group = group;
    }

    public double getArea(){
        double area = this.radius*this.radius*pi;
        return area;
    }
    public double getCircumference(){
        double area = 2*this.radius*pi;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
