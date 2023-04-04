package loops;

public class utopainTree {
    public static void main(String[] args) {

        for (int i=1;i<=10;i++){

           if (i<=3){
               System.out.println("year"+i+" - growth 1 cm");
               System.out.println("tree size: "+i*1+"cm");
           }else if (i>3){
               System.out.println("year"+i+" - growth 2 cm");
               System.out.println("tree size: "+(3+((i-3)*2)));
           }

        }


    }
}
