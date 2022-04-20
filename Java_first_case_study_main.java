package com.mycompany.java_first_case_study;
public class Java_first_case_study_main 
{
    public static void main(String[] args)
    {
        Java_first_case_study c1 = new Java_first_case_study();
        student c2 = new student();
        c2.getstudentid();
        c2.getqualification();
        c2.Current_Program();
        c2.display();
        System.out.println("-----------------------------------");
        employee c3 = new employee();
        c3.getemployeeid();
        c3.getdesignationlevel();
        c3.department();
        c3.display();
        System.out.println("------------------------------------");
    }
}
