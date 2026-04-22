class Teacher{
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void display(){
        System.out.println("name "+name);
        System.out.println("subject"+subject);
    }
}

 class Students extends Teacher {
    int rollNo;
    int Marks;

    public Students(int rollNo, int Marks, String name, String subject) {
        super(name, subject);
        this.rollNo = rollNo;
        this.Marks = Marks;
    }

    void displayStud(){
        display();
        System.out.println("roll no "+rollNo);
        System.out.println("marks" +Marks);
    }}
public class Student{


    public static void main(String[] args) {
        Students s=new Students(55, 95, "nivin", "english");
        s.displayStud();
    }
    

}
 