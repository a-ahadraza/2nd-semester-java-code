package com.mycompany.java_first_case_study;
import java.util.Scanner;
public class Java_first_case_study 
{
    public void display()
    {
        System.out.println("YOUR NAME IS:"+ ("ABDUL AHAD RAZA"));
        System.out.println("YOUR FATHER NAME IS:"+ ("SHOUKAT RAZA"));
        System.out.println("YOUR CINCI NO IS:"+ ("37405-9412528-1"));
        System.out.println("YOUR NATINOALITY:"+ ("PAKISTAN"));
        System.out.println("YOUR CITY NAME IS:"+ ("RAWALPINDI"));
    }
}
class student extends Java_first_case_study
{
    private String Student_ID;
    private String Qualification_Level; 
    private String Current_Program;
    public void getstudentid()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student ID:");
        Student_ID =  sc.next();
    }
    
    public void getqualification()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your QUALIFICATION:");
        Qualification_Level = sc.next();
    }
    
    public void Current_Program()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Current program:");
        Current_Program = sc.next();
    }
    public void display()
    {
       super.display();
       System.out.println("your student id:"+ Student_ID);
       System.out.println("your qualification"+ Qualification_Level);
       System.out.println("your current program:" + Current_Program);
    }
}
    class employee extends Java_first_case_study
{
    private String Employee_ID;
    private String Designation_level; 
    private String Department;
    
    public void getemployeeid()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Employee ID:");
        Employee_ID = sc.next();
    }
    
    public void getdesignationlevel()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Designation Level:");
       Designation_level =  sc.next();
    }
    
    public void department()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your department:");
        Department = sc.next();
    }
    public void display()
    {
       super.display();
       System.out.println("your employee name:"+ Employee_ID);
       System.out.println("your designation level is:"+ Designation_level);
       System.out.println("your current program is:" + Department);
    }
}