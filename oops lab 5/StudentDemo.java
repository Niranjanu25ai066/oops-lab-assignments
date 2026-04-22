import java.util.Scanner;

class Student {

    // Method to input name and return it
    public String inputName(String name) {
        return name;
    }

    // Method to calculate average and check pass/fail
    public String average(double m1, double m2, double m3) {
        double avg = (m1 + m2 + m3) / 3;

        if (avg > 50) {
            return "Passed (Average = " + avg + ")";
        } else {
            return "Failed ";
        }
    }
}

public class StudentDemo {

    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        // Input name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Input marks
        System.out.print("Enter mark 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter mark 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter mark 3: ");
        double m3 = sc.nextDouble();

        // Call methods
        String studentName = s.inputName(name);
        String result = s.average(m1, m2, m3);

        // Display results
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Result: " + result);

        sc.close();
    }
}
