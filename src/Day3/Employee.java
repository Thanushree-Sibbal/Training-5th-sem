package Day3;

import java.util.Scanner;

public class Employee {
    private String empname;
    private double salary;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empname = sc.next();
        double oldsalary = sc.nextDouble();
        double newsalary = sc.nextDouble();

        Day3.Singleinheritance.Employee e = new Day3.Singleinheritance.Employee();
        e.setSalary(newsalary);
        System.out.println("Employee Name "+ empname + " Salary " + e.getSalary());
    }
}