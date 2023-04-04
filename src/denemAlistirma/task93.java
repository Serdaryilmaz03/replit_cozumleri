package denemAlistirma;

import java.util.Arrays;

public class task93 {
    public static void main(String[] args) {
        String sentence="As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a \n" +
                "burst of light that had ricocheted from his temple, and saw, with that quick smile with which we \n" +
                "greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van—a \n" +
                "dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of \n" +
                "boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of \n" +
                "those who were carrying this sky, these boughs, this gliding façade.";


        String[] s = sentence.split(" ");

        int arrayLenght=s.length;
        System.out.println(arrayLenght);
        for (String word:s
             ) {
            System.out.println(word);

        }
    }
}
