package com.studentManagement;

import java.util.Scanner;

public class Student {
    private String fName;
    private String lName;
    private int gradeYear;
    private String studentID;
    private String course;
    private int tuitionBalance;
    private static int courseCost = 180;
    private static int id = 1000;

    //constructor
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first Name:");
        this.fName = in.nextLine();

        System.out.print("Enter student last Name:");
        this.lName = in.nextLine();

        System.out.print("1-Freshman\n2-Sophmore\n3-Junior\n4-Senior\nEnter student classification:");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(fName +" "+ lName +" "+studentID);

    }

    //generate ID
    private void  setStudentID(){
        id++;
        this.studentID = gradeYear+""+id;
    }
    //enroll in courses

    //view balance

    //pay tuition

    //show status

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}