package com.studentManagement;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main (String[] args){
        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for(int i=0;i<numOfStudents;i++){
            students[i] = new Student();
            students[i].studEnroll();
            students[i].payTuition();

        }
        for(int i=0;i<numOfStudents;i++) {
            System.out.println(students[i].studentStatus());
        }
    }
}
