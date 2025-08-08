package day5;

public class CustomException {
    static void agehecker(int age){
        if(age<18){
            throw new RuntimeException("Access denied!- age is less than 18");

        }
        else{
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args) {
        agehecker(15);
    }
}
