package arrayList;

import java.util.ArrayList;

public class add {

    public static ArrayList<String> test(){
        ArrayList<String> names = new ArrayList<String>();
        //write code below
names.add("ali");
names.add("hasan");
names.add("omer");




        //leave below code alone
        return names;
    }

    public static void main(String[] args) {
        System.out.println(test().size());
    }

}
