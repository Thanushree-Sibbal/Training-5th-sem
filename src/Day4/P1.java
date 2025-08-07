package Day4;

import java.util.Scanner;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Student extends Person{
    private  String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}
class Graduate extends Student{
    private int grad_year;

    public Graduate(String name, int age, String university, int grad_year) {
        super(name, age, university);
        this.grad_year = grad_year;
    }

    public int getGrad_year() {
        return grad_year;
    }
}
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String university = sc.nextLine();
        int grad_year = sc.nextInt();

        Graduate g = new Graduate(name,age,university,grad_year);
        System.out.println("Graduate: "+name+" Age: "+age+" University: "+university+" Graduation year: "+grad_year);




    }
}
