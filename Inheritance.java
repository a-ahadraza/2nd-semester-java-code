package com.mycompany.inheritance;

import java.util.Scanner;
class student
{
    public void setdisplay()
    {
        System.out.println("CATEGORIES OF STUDENT");
        System.out.println("WORKER STUDENT");
        System.out.println("INTERNATIONAL STUDENTS");
        System.out.println("TRADITIONAL");
        System.out.println("COMMUTER STUDENTS");
        System.out.println("STUDENT WITH DISABILITIES");

    }
}
class worker_student extends student
{
    private String name;
    private String insititute;
    private String job_title;
    private String job_hours;
    public void set_detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name:");
        name = sc.next();
        System.out.println("Insititute Name:");
        insititute = sc.next();
        System.out.println("Job Title:");
        job_title = sc.next();
        System.out.println("Job Hours:");
        job_hours = sc.next();
        System.out.println("------------------------------");
    }
}
class traditional extends student
{
    private String name;
    private String insititute;
    private String department;
    private String roll_no;
    private String year;
    public void set_detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name:");
        name = sc.next();
        System.out.println("Insititute Name:");
        insititute = sc.next();
        System.out.println("Department:");
        department = sc.next();
        System.out.println("Roll No:");
        roll_no= sc.next();
        System.out.println("Year:");
        year = sc.next();
        System.out.println("------------------------------");

    }
}
class international extends student
{
    private String nationality;
    private String appearing_in_aboard;
    private String P_N_S;    // pakistan national student from a foreign education system
    private String Candidate_name;
    private String institute;
    public void set_detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name:");
        Candidate_name = sc.next();
        System.out.println("Insititute Name:");
        institute = sc.next();
        System.out.println("Apperaing from aboard:");
        appearing_in_aboard = sc.next();
        System.out.println("ARE YOU FROM PAKISTAN NATIONAL STUDENT FROM A FORIGN EDUCATION SYSTEM");
        P_N_S= sc.next();
        System.out.println("------------------------------");
    }
}
class commuter_student extends student
{
    private String name;
    private String department;
    private String roll_no;
    private String university;
    public void set_detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name:");
        name = sc.next();
        System.out.println("University Name:");
        university = sc.next();
        System.out.println("Department:");
        department = sc.next();
        System.out.println("Roll No:");
        roll_no= sc.next();
        System.out.println("------------------------------");
    }
}
class student_with_disabilities extends student
{
    private String name;
    private String department;
    private String special_student_school;
    public void set_detail()
    {
                Scanner sc = new Scanner(System.in);
        System.out.println("Student Name:");
        name = sc.next();
        System.out.println("Special Student School:");
        special_student_school = sc.next();
        System.out.println("Department:");
        department = sc.next();

    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        student c1 = new student();
        c1.setdisplay();
        
        worker_student c2 = new worker_student();
        c2.set_detail();
        
        traditional c3 = new traditional();
        c3.set_detail();
        
        international c4 = new international();
        c4.set_detail();
        
        commuter_student c5 = new  commuter_student();
        c5.set_detail();
        
        student_with_disabilities c6 = new student_with_disabilities();
        c6.set_detail();
    }
}