package methods;

public class simplePrintPattern {

    public static void printHollowRect() {
        // write your codes here
        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= 4; j++) {
                if (i == 0 || j == 0 || i == 4 || j == 4){
                    System.out.print("*");}
                else{
                    System.out.print(" ");}


            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        printHollowRect();
    }

}