package com.mycompany.java2_grp1;

import java.util.Scanner;

public class Answers {
    Scanner input = new Scanner(System.in);


    //Answer 1
    public void answer1(){

        Circle Circle_1 = new Circle();
        System.out.println("We have been classified to Group "+ Circle_1.getGroup());
        System.out.println("The area of this circle is "+Circle_1.getArea()+ "and the color is "+Circle_1.getColor());
    }


    //Answer 2
        //Answer 2a
    public void answer2a(){

        System.out.printf("Enter the radius of this circle: ");
        double radius = input.nextInt();
        Circle circle_1 = new Circle(radius);
        System.out.println("\nThis constructor used here is receiving 1 argument\n" +
                "The radius of this circle is "+ radius+ " and the color is "+ circle_1.getColor()+"\n" +
                "The area of this circle is "+circle_1.getArea()+ " and the circumference is " +circle_1.getCircumference()+"\n" +
                "This project belong to groups "+ circle_1.getGroup());
    }
        //Answer 2b
    public void answer2b(){
        System.out.printf("Enter the radius of this circle: ");
        double radius = input.nextInt();
        System.out.printf("\nEnter the color of this circle: ");
        String color = input.next();

        Circle circle = new Circle(radius, color);

        System.out.println("This constructor used here is receiving 2 arguments\n" +
                "The radius of this circle is "+circle.getRadius()+" and the color is "+circle.getColor()+"\n" +
                "The area of this circle is "+circle.getArea()+" and the circumference is "+circle.getCircumference()+"\n" +
                "This project belong to groups "+circle.getGroup());
    }
    //Answer2c
    public void answer2c(){
        System.out.printf("Enter the radius of this circle: ");
        double radius = input.nextInt();
        System.out.printf("\nEnter the color of this circle: ");
        String color = input.next();

        System.out.printf("\nEnter the group of this project : ");
        String group = input.next();

        Circle circle = new Circle(radius, color, group);

        System.out.println("\nThis constructor used here is receiving 3 arguments\n" +
                "The radius of this circle is "+circle.getRadius()+" and the color is "+circle.getColor()+"\n" +
                "The area of this circle is "+circle.getArea()+" and the circumference is "+circle.getCircumference()+"\n" +
                "This is group number: "+circle.getGroup());
    }


    //Answer 3

}
