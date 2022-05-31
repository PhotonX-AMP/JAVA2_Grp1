package com.mycompany.java2_grp1;

import java.util.Scanner;

/**
 * This class takes care of running the program
 */
public class Main extends Answers {

    //Main method

    /**
     * this is the main method of the whole program
     * @param args
     */
    public static void main(String[] args) {
        Questions questions = new Questions();
        Answers answers = new Answers();


        Scanner input = new Scanner(System.in);


        System.out.println("JAVA PROGRAMMING: GROUP 01\n");
        int choice = 0;
        while(choice != 5) {
            System.out.printf("\nOptions:\n" +
                    "1. Question 1\n" +
                    "2. Question 2\n" +
                    "3. Question 3\n" +
                    "4. Display Group Members\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Question 1:");
                    int choose = 0;
                    while (choose != 3) {
                        System.out.printf("\n\t1. Show question \n\t2. Show answer \n\t3.Back \n\tEnter your choice:  ");
                        choose = input.nextInt();
                        switch (choose) {
                            case 1:
                                questions.Question1();
                                break;
                            case 2:
                                answers.answer1();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid input! \n");
                                break;
                        }
                    }
                    break;


                case 2:
                    System.out.println("Question 2:");
                    questions.Question2();
                    choose = 0;
                    while (choose != 3) {
                        System.out.printf("\n\t1. Question 2a " +
                                "\n\t2. Question 2b " +
                                "\n\t3. Question 2c " +
                                "\n\t4. Back " +
                                "\n\tEnter your choice: ");
                        choose = input.nextInt();
                        switch (choose) {
                            case 1:
                                questions.Question2a();
                                System.out.println(" ");
                                answers.answer2a();
                                break;
                            case 2:
                                questions.Question2b();
                                System.out.println(" ");
                                answers.answer2b();
                                break;
                            case 3:
                                questions.Question2c();
                                System.out.println(" ");
                                answers.answer2c();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid input! \n");
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Question 3:");
                    choose = 0;
                    while (choose != 3) {
                        System.out.printf("\n\n\t1. Show question " +
                                "\n\t2. Show answer " +
                                "\n\t3.Back " +
                                "\n\tEnter your choice:  ");
                        choose = input.nextInt();
                        switch (choose) {
                            case 1:
                                questions.Question3();
                                break;
                            case 2:
                                answers.answer3();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid input! \n");
                                break;
                        }
                    }
                    break;
                case 4:
                    Main main = new Main();
                    main.displayMembers();
                    break;


                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
    }

    /**
     * this method displays all the group members
     */
    public void displayMembers(){
        System.out.println("1.\tICTU20201200\tABDOUL AZIS" +
                "\n2.\tICTU20212183\tACHA Naomi Blanche Eya" +
                "\n3.\tICTU20201493\tAKOM, Tikum Donald" +
                "\n4.\t************\tAMBELLA FRANCIS NDOFOR" +
                "\n5.\tICTU20201172\tANABA MVOGO BORIS CLOTAIRE" +
                "\n6.\t************\tANIEFIOK CHRISPAT NKWENTI JUNIOR" +
                "\n7.\t************\tANUAFOR BRICE NKWENTI" +
                "\n8.\tICTU20201803\tANZIA JUVIS ANGWERI" +
                "\n9.\tICTU20201589\tASONGANYI TINTINU" +
                "\n10.\tICTU20201722\tAWASUM, PRECIOUS MUA-WALLANG" +
                "\n11.\tICTU20212488\tMUDOH CHRIS AGWO");
    }
}
