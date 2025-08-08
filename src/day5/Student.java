package day5;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {

        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name not valid");
        }
        this.name = name;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not b/w 15 to 21");
        }
        this.age = age;

        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + age + " " + course;
    }

    public static void main(String[] args) {
        try {
            Student s = new Student (100, "Babu", 20, "MCA");
            System.out.println(s);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
