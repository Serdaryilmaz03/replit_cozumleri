package Statements;

import java.util.Scanner;

public class ifstatementGrades {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        //Write your code here:
        if (grade >= 90) {
            System.out.println("exellent");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("good");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}