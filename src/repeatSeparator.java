import java.util.Scanner;

public class repeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        String output="";
        int count = scan.nextInt();
        for (int i=1;i<=count;i++){
            if (i<count){
                output+=word+separator;
            }else{
                output+=word;
            }


        }

        System.out.println(output);

    }
}
