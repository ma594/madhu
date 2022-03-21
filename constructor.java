import java.util.*;
class student
{
    int rollno;
    string name;
    string section;
    int marks;
    string address;
    static string college name;
    {
    static college name="bitlabs";
    }
    //constructor overloading
    student int rollno,string name,string section,int marks,string address)
    {
        this.rollno=rollno;
        this.name=name;
        this.section=section;
        this.marks=marks;
        this.address=address;
    }
    student
    {
        this(123,"madhu","A",50,"vijayawada");
    }
    student(int r)
    {
        rollno=r;
    }
    void display()
    {
        System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
    }
    void reading()
    {
        System.out.println(name+"reading");
    }
    void writing()
    {
        this.reading();
        System.out.println(name+"writing");
    }
}
class main
{
    public static void main(string args[])
    {
        student std1=new student (123,"priya","A",94,"manthena");
        //student .college name="bitlabs";
        System.out.println("student 1 information");
        std1.display();
        System.out.println(student.collegename);
        std1.reading();
        std1.writing();
        student std2=new student(3,4,5);
        System.out.prntln("student 2  information");
        std2.display();
        System.out.println(student.collegename);
        std2.reading();
        std2.writing();
        student std3=new student();
        System.out.println("student 3 information");
        std3.display();
        System.out.println(student.collegename);
        std3.reading();
        std3.writing
        
    }
}
    }
        
    }
        
    }
    }
    }
    }
        
        
    }
    
    
}