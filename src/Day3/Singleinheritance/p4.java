package Day3.Singleinheritance;

import java.util.Scanner;

class Employee {
    int empId;
    float salary;

    Employee(int empId, float salary){
        this.empId = empId;
        this.salary = salary;
    }

}
class Emplevel extends Employee1 {

    Emplevel(int eId, float salary){
        super(eId, salary);
    }

    int checkLevel(float salary){
        int level;
        if(salary > 1000){
            level = 1;
        }else{
            level = 2;
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        Emplevel e = new Emplevel(empId, salary);
        int Level =  e.checkLevel(salary);
        System.out.println(empId + "\n" +  salary + "\n" + Level);

    }
}