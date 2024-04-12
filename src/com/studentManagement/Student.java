package com.studentManagement;

import java.util.Scanner;

public class Student {
    private String fName;
    private String lName;
    private int gradeYear;
    private String studentID;
    private String courses = " ";
    private int tuitionBalance = 0;
    private static int courseCost = 180;
    private static int id = 1000;

    //constructor
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter student first Name:");
        this.fName = in.nextLine();

        System.out.print("Enter student last Name:");
        this.lName = in.nextLine();

        System.out.print("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\nEnter student classification:");
        this.gradeYear = in.nextInt();

        setStudentID();
        //System.out.println(fName +" "+ lName +" "+studentID);

    }

    //generate ID
    private void  setStudentID(){
        id++;
        this.studentID = gradeYear+""+id;
    }
    //enroll in courses
    public void studEnroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n" + " " +course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {break;}
        } while(true);
        //System.out.println("\nEnrolled in: " + courses);
        //System.out.println("Tuition Balance: $" + tuitionBalance);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //show status
    public String studentStatus(){
        return "\nName: " + fName + " " + lName +
                "\nGrade Year: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }

}