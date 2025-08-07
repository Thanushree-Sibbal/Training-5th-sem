package Day3;

class Person {
    String fname;
    String lname;

    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
}

class Student extends Person {
    int usn;

    Student(String fname, String lname, int usn) {
        super(fname, lname);  // Call to parent class constructor
        this.usn = usn;       // Set student-specific field
    }
    public class Main {
        public static void main(String[] args) {
            Student s = new Student("Thanushree", "Sibbal", 123);
            System.out.println("Name: " + s.fname + " " + s.lname);
            System.out.println("USN: " + s.usn);
        }
    }

}

