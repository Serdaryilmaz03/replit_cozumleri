package methods.methodsWithReturn;

import java.util.Scanner;

public class validateTask {
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
        // your code here
        if (notEmpty == true && taskId  == currentId+1) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }

}
