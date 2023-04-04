package Statements;

import java.util.Scanner;

public class citizens {
    public static void main(String[] args) {
        int seniorCitizens;
        int nonSeniorCitizens;
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        seniorCitizens=scanner.nextInt();
        nonSeniorCitizens=scanner.nextInt();
        System.out.println("What is new citizen's age?");
        age =scanner.nextInt();
        if (age>=65){
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens count "+(seniorCitizens+1));
            System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);


        }else {
            System.out.println("Non Senior Citizen");
            System.out.println("New seniorCitizens count "+seniorCitizens);
            System.out.println("New nonSeniorCitizens count "+(nonSeniorCitizens+1));


        }
    }


}
