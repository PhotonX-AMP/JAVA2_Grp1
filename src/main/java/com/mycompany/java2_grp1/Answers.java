package com.mycompany.java2_grp1;

import java.util.Scanner;

/**
 * this is the class that handles all the answers
 */
public class Answers extends Questions{
    Scanner input = new Scanner(System.in);


    //Answer 1

    /**
     * Displays answer 1
     */
    public void answer1(){

        Circle Circle_1 = new Circle();
        System.out.println("\nWe have been classified to Group "+ Circle_1.getGroup());
        System.out.println("The area of this circle is "+Circle_1.getArea()+ " and the color is "+Circle_1.getColor());
    }


    //Answer 2
        //Answer 2a
    /**
     * Displays answer 2a
     */
    public void answer2a(){

        System.out.printf("\nEnter the radius of this circle: ");
        double radius = input.nextInt();
        Circle circle_1 = new Circle(radius);
        System.out.println("\n\tThis constructor used here is receiving 1 argument\n" +
                "\tThe radius of this circle is "+ radius+ " and the color is "+ circle_1.getColor()+"\n" +
                "\tThe area of this circle is "+circle_1.getArea()+ " and the circumference is " +circle_1.getCircumference()+"\n" +
                "\tThis project belong to groups "+ circle_1.getGroup());
    }

        //Answer 2b
    /**
     * Displays answer b
     */
    public void answer2b(){
        System.out.printf("\nEnter the radius of this circle: ");
        double radius = input.nextInt();
        System.out.printf("\nEnter the color of this circle: ");
        String color = input.next();

        Circle circle = new Circle(radius, color);

        System.out.println("\tThis constructor used here is receiving 2 arguments\n" +
                "\tThe radius of this circle is "+circle.getRadius()+" and the color is "+circle.getColor()+"\n" +
                "\tThe area of this circle is "+circle.getArea()+" and the circumference is "+circle.getCircumference()+"\n" +
                "\tThis project belong to groups "+circle.getGroup());
    }
    //Answer2c
    /**
     * Displays answer 2c
     */
    public void answer2c(){
        System.out.printf("\n\tEnter the radius of this circle: ");
        double radius = input.nextInt();
        System.out.printf("\n\tEnter the color of this circle: ");
        String color = input.next();

        System.out.printf("\n\tEnter the group of this project : ");
        String group = input.next();

        Circle circle = new Circle(radius, color, group);

        System.out.println("\n\tThis constructor used here is receiving 3 arguments\n" +
                "\tThe radius of this circle is:  "+circle.getRadius()+" and the color is: "+circle.getColor()+"\n" +
                "\tThe area of this circle is:  "+circle.getArea()+" and the circumference is:  "+circle.getCircumference()+"\n" +
                "\tThis is group number: "+circle.getGroup());
    }


    //Answer 3
    /**
     * Displays answer 3
     */
    public void answer3(){
        Circle circle = new Circle();
       Circle circle1 = new Circle(4, "brown", "One(1)");
        System.out.println("\n\tThe default values of radius, color and group of this circle are:  "+circle.getRadius()+", "+circle.getColor()+" and "+circle.getGroup()+ "\n" +
                "\tThe new values of radius, color and group are:  "+circle1.getRadius()+", "+circle1.getColor()+" and "+circle1.getGroup()+" respectively.\n" +
                "\tThe area of this circle is:  "+circle1.getArea()+" and the circumference is:  "+circle1.getCircumference()+"\n"+
                "\tThis is group number:  "+circle1.getGroup());
    }

}
