class Course {
    int ID;
    String Description;
    int Duration;
    double Fees;

    // Parameterized Constructor
    Course(int id, String desc, int dur, double fee) {
        ID = id;
        Description = desc;
        Duration = dur;
        Fees = fee;
    }

    // Method to display data
    void GetData() {
        System.out.println("Course ID: " + ID);
        System.out.println("Description: " + Description);
        System.out.println("Duration: " + Duration + " months");
        System.out.println("Fees: " + Fees);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Array of 5 Course objects
        Course[] courses = new Course[5];

        courses[0] = new Course(101, "C++ Programming", 6, 15000);
        courses[1] = new Course(102, "Java Programming", 5, 14000);
        courses[2] = new Course(103, "Python Programming", 4, 13000);
        courses[3] = new Course(104, "Web Development", 6, 16000);
        courses[4] = new Course(105, "Data Science", 8, 20000);

        // Display all courses
        for (int i = 0; i < courses.length; i++) {
            courses[i].GetData();
        }
    }
}