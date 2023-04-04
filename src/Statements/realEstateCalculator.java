package Statements;

import java.util.Scanner;

public class realEstateCalculator {
    public static void main(String[] args) {

            int propertyPrice =0;

            int numberOfBedrooms, garageSpots;
            float metroAccessibility, schoolScore, highwayAccessibility;
            boolean backyard, smoking, garage;
            String houseType;
            Scanner scan = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("* Welcome to the RealEstate calculator! *");
            System.out.println("*****************************************");
            //WRITE YOUR CODE HERE
            System.out.println("Enter your property Type:");
            houseType = scan.next();
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            System.out.println("Do you have a backyard?");
            backyard = scan.hasNext();
            if (houseType == "Condo" && backyard == true) {
                System.out.println("Backyard is not available for condo!");
            }
            System.out.println("Do you have garage?");
            garage = scan.hasNext();
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not public parking!");
            }
            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            System.out.println("Does any of your family members smoking?");
            smoking= scan.hasNext();
            System.out.println("Market report has been generated.");
            if (houseType=="Condo"){
                propertyPrice=5000;
            }else if (houseType=="Townhouse"){
                propertyPrice=75000;
            }else if (houseType=="Single Family Home"){
                propertyPrice=95000;
            }if (metroAccessibility<=1){
                int total=propertyPrice+10000;

            }else if (metroAccessibility>1){
                int total=propertyPrice+5000;

            }if (highwayAccessibility<=1){
                int total=propertyPrice=15000;
            }else if (highwayAccessibility>1&&highwayAccessibility<=5){
                int total=8000+propertyPrice;
            }else{
                int total=4000+propertyPrice;
            }if (schoolScore<=10&&schoolScore>=8){
                int total=45000+propertyPrice;
            }else if (schoolScore<8&&schoolScore>=4){
                int total=20000+propertyPrice;
            }else{
                int school=5000;
            }if (smoking==true){
                int total=500+propertyPrice;
            }else{ ;}



        }
    }
