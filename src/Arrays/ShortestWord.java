package Arrays;

import java.util.Scanner;

public class ShortestWord {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] str = {scan.next(), scan.next(), scan.next(),
                    scan.next(), scan.next(), scan.next()};
            String shrtword = str[0];
            for (String newword : str){
                    if (newword.length() < shrtword.length()) {
                        shrtword=newword;
                    }
                }
                System.out.println(shrtword);
            }
        }
