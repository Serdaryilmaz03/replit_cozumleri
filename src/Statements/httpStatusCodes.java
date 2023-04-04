package Statements;

import java.util.Scanner;

public class httpStatusCodes {
    public static void main(String[] args) {
        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();
        if (status==200){
            System.out.println("OK");
        }else if (status==201){
            System.out.println("Created");
        }else if (status==202){
            System.out.println("Accepted");
        }else if (status==301){
            System.out.println("Moved Permanently");
        }else if (status==303){
            System.out.println("See Other");
        }else if (status==304){
            System.out.println("Not Modified");
        }else if (status==307){
            System.out.println("Temporary Redirect");
        }else if (status==401){
            System.out.println("Unuthorized"
            );
        }else if (status==400){
            System.out.println("Bad Request");
        }else if (status==403){
            System.out.println("Forbidden");
        }else if (status==404){
            System.out.println("Not Found");
        }else if (status==410){
            System.out.println("Gone");
        }else if (status==500){
            System.out.println("Internal Server Eror");
        }else if (status==503){
            System.out.println("Service Unavailable");
        }
    }
}
