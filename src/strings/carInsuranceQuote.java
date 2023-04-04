package strings;

import java.util.Locale;
import java.util.Scanner;

public class carInsuranceQuote {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name = scan.next();
        System.out.println("Do you have a US driver license?");
        String licence = scan.next();
        if (licence.equalsIgnoreCase("no")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        if (zipcode == 20910 || zipcode == 20740) {
            premium = premium + 60;
        } else if (zipcode == 22102 || zipcode == 22103) {
            premium += 30;
        } else {
            premium += 50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equals("owned")) {
            premium += 10;
        } else {
            premium += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("Comute")) {
            premium += 20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();

        premium = premium + daysDrivenToWorkOrSchool * 5;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();
        premium = premium + milesToWorkOrSchool * 1;
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age >= 16 && age < 18) {
            premium = premium * 20;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;
        } else if (age > 21 && age < 25) {
            premium *= 2;
        }else{
            premium=premium*1;
        }
        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        if (experience <= 0 && age-experience<16) {
            System.out.println("Invalid data!");
            System.exit(0);

        } else {
            premium = premium - experience * 5;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if (accident.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            premium = premium + (premium * 20 / 100 * accidentsAmount);
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")){
            premium=premium*2;
        }
        System.out.println("What is the highest level of education you have completed?");
        education= scan.next();
        if (education.equalsIgnoreCase("Phd")||education.equalsIgnoreCase("\"Bachelors\"")||education.equalsIgnoreCase("Masters")){
            premium=premium*95/100;
        }else if (education.equalsIgnoreCase("Doctors")){
            premium=premium*90/100;
        }else if (education.equalsIgnoreCase("High scholl")){
            premium=premium;
        }else{
            premium=premium*105/100;
        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: "+premium);
        referenceNumber=name.substring(0,2).toUpperCase(Locale.ROOT)+age+name.substring(name.length()-2,name.length()).toUpperCase(Locale.ROOT)+zipcode+education.toUpperCase(Locale.ROOT);
        System.out.println("Reference number: "+referenceNumber);

    }
}