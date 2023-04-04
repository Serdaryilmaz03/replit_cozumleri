package Statements;

import java.util.Scanner;

public class laptopConfigurator {
    public static void main(String[] args) {
        double screenSize;
        String CPUType, storageType, screenResolution;
        int ram=0;
        int memorySize;
        double price = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        }
        System.out.println("Select CPU type:");
        CPUType = scan.next();
        if (CPUType.equals("i3")) {
            price =price+ 150;
        }else if(CPUType.equals("i5")) {
            price =price+ 250;
        }else if (CPUType.equals("i7")) {
            price =price+ 350;
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price=(ram*50/4)+price;
        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        if (storageType.equals("HDD")){
            price=price+(memorySize*50/500);
        }else if (storageType.equals("SDD")){
            price=price+(memorySize*100/500);
        }
        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        if (screenResolution.equals("FULLHD")){
            price=price+100;
        }else if (screenResolution.equals("4K")){
            price=price+200;
        }
        System.out.println("Laptop price is: "+"$"+price);
    }
}
