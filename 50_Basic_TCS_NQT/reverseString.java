
import java.util.*;
// approach 
// firstly i got a empty string and then  
// put the value of another string in it from back side like  a b c d = d c b a 
// put all values and find our reverse string 

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i++) {
            rev += str.charAt(i);

        }
        System.out.println(rev);

    }

}
