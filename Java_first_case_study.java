/*
Create a class for Person, apply proper encapsulation to the members of the class. Name, FatherName, CNIC, Nationality, City should be included as the members of the class. For each data member, there should be a proper getter setter method available. Moreover, there should be a display function which will show all the information about the Person when called.
Inherit two classes from the Person class that you have created in the last question. One should be Student and one should be Employee.

Student should contain more data members such as Student ID, Qualification Level, Current Program. Employee should have more data members such as Employee ID, Designation, and Department. All the data members should have getter setter methods.
Apply polymorphism for the inherited classes on the display function. The Student’s display function should show all the relevant information about person and for the student. Similar for the Employee.
Provide a Main Function for creating the objects. Create one object each for Person, Student and Employee, Assign the values in the respective objects and display the contents for each class as per the case study.

*/
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
