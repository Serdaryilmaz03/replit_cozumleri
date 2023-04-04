package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class deliveryCalculataor {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {



return max_fuel;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }

}
