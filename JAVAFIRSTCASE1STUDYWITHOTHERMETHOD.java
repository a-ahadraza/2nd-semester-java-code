class Person{
    private String name;
    private String fatherName;
    private String CNIC;
    private String Nationality;
    private String City;
    
    public void setValues(String name, String fatherName, String CNIC, String Nationality, String City){
        this.name = name;
        this.fatherName = fatherName;
        this.CNIC = CNIC;
        this.Nationality = Nationality;
        this.City = City;
    }
    
    public void display(){
        System.out.println(name);
        System.out.println(fatherName);
        System.out.println(CNIC);
        System.out.println(Nationality);
        System.out.println(City);
    }
}

class Student extends Person{
    private String studentID;
    private String qualification;
    private String currentProgram;
    
    public void setValues(String studentID, String qualification, String currentProgram){
        super.setValues("Ahmad", "Syed Shabbir Ahmad", "3740597818635", "Pakistani", "Rawalpindi");
        
        this.studentID = studentID;
        this.qualification = qualification;
        this.currentProgram = currentProgram;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println(studentID);
        System.out.println(qualification);
        System.out.println(currentProgram);
    }
}

public class JAVAFIRSTCASE1STUDYWITHOTHERMETHOD 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        Student s = new Student();
        
        p.setValues("Hassaan", "Afzaal Ahmad", "6110179777777", "Pakistani", "Islamabad");
        System.out.println("Person Display");
        System.out.println("");
        p.display();
        System.out.println("");
        
        s.setValues("FA16-RCS-002", "BS(CS)", "MS(CS)");
        System.out.println("Student Display");
        System.out.println("");
        s.display();
    }
}