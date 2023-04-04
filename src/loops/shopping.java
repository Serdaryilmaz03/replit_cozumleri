package loops;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

String output="";

        String answer="";
        int n=1;
        double total=0;
        do {


            String item="Item"+n;
            System.out.println("Enter " + item + " and its price");
            n++;
            String name = scanner.next();
            double price = scanner.nextDouble();
            total=total+price;
            if (answer.equals("yes")){
                output=output+", ";
            }
            output+=item+": "+name+" Price: "+price;




            System.out.println("Add one more item?");
            answer = scanner.next();



        }while (answer.equals("yes"));
        System.out.println(output);
        System.out.println(total);



    }
}
