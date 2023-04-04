package methods.overLoading;

import java.util.Scanner;



public class methodOverloading1 {




        // Write your code here

        public static int findMax(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;

        }

        public static double findMax(double[] arr) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }





// DO NOT TOUCH THE MAIN METHOD

    public static  void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));

            } else{
                double[] arr = new double[size];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = in.nextDouble();
                }
                System.out.println(findMax(arr));
            }

        }

    }
//false
//5
//2.2
//6.41
//7.8
//6.1