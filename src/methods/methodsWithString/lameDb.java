package methods.methodsWithString;

import java.util.Scanner;

public class lameDb {
    public static String lameDb(String db, String op, String id, String data) {
        String[] arr=db.split("#");
        String str="";

        if (op=="add") {
            if (id=="4"){
str=arr[0]+"#"+arr[1]+"#"+arr[2]+"#"+id+data;
            }else if (id=="3"){

            }

            }

         else if (op.equals("edit")) {

        } else if (op.equals("delete")) {

        }


        return null;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
