package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class diving {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            float[] score = new float[7];
            //WRITE YOUR CODE HERE

            System.out.println("Enter score for judge 1:");
            score[0]=input.nextFloat();
            System.out.println("Enter score for judge 2:");
            score[1]=input.nextFloat();
            System.out.println("Enter score for judge 3:");
            score[2]=input.nextFloat();
            System.out.println("Enter score for judge 4:");
            score[3]=input.nextFloat();
            System.out.println("Enter score for judge 5:");
           score[4]= input.nextFloat();
            System.out.println("Enter score for judge 6:");
            score[5]=input.nextFloat();
            System.out.println("Enter score for judge 7:");
            score[6]=input.nextFloat();
            System.out.println("Enter difficulty:");
            float difficulty=input.nextFloat();
           float total=0;
            Arrays.sort(score);
            for (int i=1;i< score.length-2;i++){
                total+=score[i];

            }

            total=total*0.6f*difficulty;
            System.out.printf("Total: %.2f", total);
        }
    }
