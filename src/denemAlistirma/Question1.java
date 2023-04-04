package denemAlistirma;

public class Question1 {
    public static void main(String[] args) {
        int[] x = {1,2,6};
        int[] y = {6,1,2,3};
        int[] z = {13,6,1,2,3};
        System.out.println(appears6(x));
        System.out.println(appears6(y));
        System.out.println(appears6(z));

    }

    public static boolean appears6(int[] arr) {
        if (arr.length < 1) {
            return false;
        }
        if (arr[0] == 6 || arr[arr.length-1]==6) {
            return true;
        }
return false;
    }

}