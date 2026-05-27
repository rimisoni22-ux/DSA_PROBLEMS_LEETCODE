package leeetcode_problems.String;

public class countnumberofspecialchar {

    public static void main(String[] args) {
        String word = "aabABc";

        int count = 0;
        // loop from a to z 
        for (char ch = 'a'; ch <= 'z'; ch++) {

            // consider lower and upper false 
            boolean lower = false;
            boolean upper = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    lower = true;
                }
                if (word.charAt(i) == ch - 32) {
                    upper = true;
                }
            }
            if (lower && upper) {
                count++;
            }

        }
        System.out.println(count);

    }
}
