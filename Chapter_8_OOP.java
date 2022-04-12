// CHAPTER 8 -PRACTICE SET
package com.mycompany.chapter_8_oop;
public class Chapter_8_OOP 
{
    private String Salary;
    private String name;
    
    public String getsalary()
    {
        return Salary;
    }
    
    public void setsalary(String a)
    {
        Salary = a;
    }
    
    //EMPLOYEE NAME:
    public String getname()
    {
        return name;
    }
     
    public void setname(String b)
    {
        name = b;
    }
    public static void main(String[] args)
    {
        Chapter_8_OOP C1 = new Chapter_8_OOP();
        C1.setsalary("45,000$");
        C1.setname("ABDUL-AHAD-RAZA");
        System.out.println("your name is:"+ C1.getname()+("")+ "and your salary:"+C1.getsalary());
    }
}
