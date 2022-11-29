// Task01:

import java.util.Arrays;
import java.util.Random;

public class HW02_01 {
    // Java program to find smallest window containing all characters of a pattern.
    static final int no_of_chars = 256;

    // Function to find smallest window containing all characters of 'pat'
    static String findSubString(String str, String pat) {
        int len1 = str.length();
        int len2 = pat.length();

        // Check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }

        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];
//        System.out.println(hash_pat.getClass().getTypeName());

        // Store occurrence of characters of pattern
        for (int i = 0; i < len2; i++) {
//            System.out.println("pat.charAt = " + pat.charAt(i));
            hash_pat[pat.charAt(i)]++;
//            System.out.println("hash_pat[] = " + hash_pat[pat.charAt(i)]);
//            System.out.println();
//            System.out.println("2. " + Arrays.toString(hash_str));
        }
        int start = 0, start_index = -1,
                min_len = Integer.MAX_VALUE;

        // Start traversing the string
        // Count of characters
        int count = 0;
        for (int j = 0; j < len1; j++) {

            // Count occurrence of characters of string
//            System.out.print("str.charAt = " + str.charAt(j)+ "; ");
            hash_str[str.charAt(j)]++;
//            System.out.printf("hash_str[%c] = %d; \n",str.charAt(j) , hash_str[str.charAt(j)]);
//            System.out.printf("");
            // If string's char matches with pattern's char then
            // increment count
            if (hash_str[str.charAt(j)]
                    <= hash_pat[str.charAt(j)])
                count++;

            // If all the characters are matched
            if (count == len2) {

                // Try to minimize the window
                while (hash_str[str.charAt(start)]
                        > hash_pat[str.charAt(start)]
                        || hash_pat[str.charAt(start)]
                        == 0) {

                    if (hash_str[str.charAt(start)]
                            > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting
        // from start_index
        // and length min_len
        return str.substring(start_index,
                start_index + min_len);
    }

    // Driver Method
    public static void main(String[] args) {
        String str = "this is a test string";
        System.out.println("The test string: " + str);
        String pat = "tist";
        System.out.println("The pattern string: " + pat);

        System.out.print("The smallest window: " + findSubString(str, pat));
    }
}
