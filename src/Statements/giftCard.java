package Statements;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        /* > **_List of items_**
> Blanket - 60$
> Charger - 25$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$ */
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
       switch (input){
           case"Blanket":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 40$");
               break;
           case "Charger":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 75$");
               break;
           case "Hat":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 25$");
               break;
           case "Headphones":
               System.out.println("Thank you for your purchase! ");
               System.out.println("Your current balance is: 70$");
               break;
           case "Pants":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 50$");
               break;
           case "Pillow":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 60$");
               break;
           case "Socks":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 95$");
               break;
           case "Usb cable":
               System.out.println("Thank you for your purchase!");
               System.out.println("Your current balance is: 90$");
               break;
           case "Laptop":
               System.out.println("Sorry, not enough funds on your gift card!");
               break;
           case "Smartphone":
               System.out.println("Sorry, not enough funds on your gift card!");
               break;
           default:
               System.out.println("Invalid item!");

       }

    }
}
