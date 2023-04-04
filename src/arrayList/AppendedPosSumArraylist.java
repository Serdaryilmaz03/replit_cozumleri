package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendedPosSumArraylist {
    private static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList <Integer>negatives=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)<=0){
               negatives.add(list.get(i));
           }else {
               sum+=list.get(i);
           }

        }
        list.removeAll(negatives);
        list.add(sum);
        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }




}