package denemAlistirma;

public class question2 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {1,2,3,1};
        int[] z = {1,2,1};
        System.out.println(arraylenght(x));
        System.out.println(arraylenght(y));
        System.out.println(arraylenght(z));

    }
    public static boolean arraylenght(int [] arr){
        if (arr.length<=1){
            System.out.println("not a valid array");
        }else if (arr[0]==arr[arr.length-1]){
            return true;
        }
        return false;
    }
}
