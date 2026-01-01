// Program to determine if a student has passed or failed using ternary operator

public class Student {
    public static void main(String[] args){
        int marks = 21;
        String Status = marks >= 33 ? "Pass" : "Fail" ;
        System.out.println("The student has " + Status + "ed the exam.");
    }
}
