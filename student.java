import java.util.*;
class student
{
    int rollno;
    string name;
    string section;
    int marks;
    string address;
    //constructor ooerloading
    student(int r,string n,string s,intm,string a)
    {
        rollno=r;
        name=n;
        section=s;
        marks=m;
        address=a;
    }
    student(intr)
    {
        rollno=r;
    }
    void display()
    {
        System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"address);
    }
    void reading()
    {
        Sytem.out.println(name+"reading");
    }
    void writing()
    {
        System.out.println(name+"writing");
    }
    class main
    {
        Public static void main(string args[])
        {
            student std1=new student(123,"madhu","n",90,"manthena");
            System.out.prinln("student 2 information");
            std2.display();
            ssd2.reading();
            std2.writing();
            student std3=new student();
            System.out.println("student 3 information");
            std3.display();
            std3.reading();
            std3.writing();
        }
    }
        
    }
    }
    
    }
    }