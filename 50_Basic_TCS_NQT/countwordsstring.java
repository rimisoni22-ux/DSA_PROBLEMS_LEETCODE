
import java.util.*;

public class countwordsstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // remove extra spaces 
        str = str.trim();

        // split string inti words 
        String[] words = str.split("//s+");
        // print number of words
        System.out.println("Number of words =" + words.length);

    }

}
