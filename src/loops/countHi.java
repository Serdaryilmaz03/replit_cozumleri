package loops;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;
   for (int i=0;i<str.length()-1;i++){

      String hi=""+str.charAt(i)+str.charAt(i+1);
      if (hi.equals("hi")){
          count++;
      }
       }
        System.out.println(count);

   }


    }

