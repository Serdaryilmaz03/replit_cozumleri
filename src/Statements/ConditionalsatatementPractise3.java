package Statements;
import java.util.Scanner;
public class ConditionalsatatementPractise3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

switch (name){
    case "Chen":
        System.out.println("teacher");
        break;
    default:
        System.out.println("student");
}
    }
}