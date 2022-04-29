package com.mycompany.case_study;
public class Address 
{
    public String Street_no;
    public double House_no;
    public String City;
    public int Code;
    
    public void setStreet_no(String StNo )
    {
        this.Street_no=StNo;
    }
    public String getStreet_no()
    {
        return Street_no;
    }
     public void setHouse_no(double H_No )
    {
        this.House_no=H_No;
    }
       public double getHouse_no()
    {
        return House_no;
    }
       public void setCity(String C )
    {
        this.City = C;
    }
    public String getCity()
    {
        return City;
    }
    
    public void setCode(int code )
    {
         this.Code=code;
    }
    public int getCode()
    {
        return Code;
    }
    public void Display()
    {
        System.out.print(Street_no);
        System.out.println(City);  
        System.out.println(House_no);  
        System.out.println(Code);  

    }
}
class Person 
{
    private String Name;
    private int age;
    private Address add;
    
    
    public void setPerson(String N,int A,Address add )
    {
        this.Name=N;
        this.add=add;
        this.age=A;
    }
    public void display()
    {
       System.out.println("NAme of Person is:- "+Name);
       System.out.println("Address of the Person is :-"+add);         
       System.out.println();
       
       
       System.out.println( "Address..!?");
       System.out.println("Street no #:"+ add.getStreet_no());
       System.out.println(" House no #:"+add.getHouse_no());
       System.out.println("City is "+ add.getCity());
       System.out.println("Code of the city:"+add.getCode() );        
    }
}


public class Case_Study 
{
    public static void main(String[] args) 
    {
        Address A= new Address ();
        A.setStreet_no("2345555");
        A.setCity("Rawalpindi ");
        A.setHouse_no(1882);
        A.setCode(9326);
                
                
        Person P= new Person();  
        P.setPerson("ShezarRJ", 1234, A);
        P.display();
    }
}
