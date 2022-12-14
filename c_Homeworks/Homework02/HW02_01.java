// Task01: Create a program to find the smallest window in a long string
// containing all characters of a smaller string.
public class HW02_01 {
    // NOTE: !!! The first 256 characters of Unicode are considered to be potentially
    // present in strings. Therefore, program won't work with non-latin alphabet !!!
    static final int no_of_chars = 256;

    // Method to find the smallest window:
    static String findSubString(String str_long, String str_short) {
        int len_long = str_long.length();
        int len_short = str_short.length();

        // If length of long string is actually shorter, then:
        if (len_long < len_short) {
            System.out.println("No such window exists");
            return "";
        }

        int long_array[] = new int[no_of_chars];
        int short_array[] = new int[no_of_chars];
        // ================================================================
        // Count occurrences of each character of short string and store
        // them as elements of short_array under indices corresponding to
        // characters numbers in Unicode
        for (int i = 0; i < len_short; i++) {short_array[str_short.charAt(i)]++;}

        // ================================================================
        // Go through the long string:
        // Count occurrences of characters in the long string.
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0; j < len_long; j++) {
            long_array[str_long.charAt(j)]++;

            // If  long string's char matches with short string's char then
            // increment count
            if (long_array[str_long.charAt(j)]
                    <= short_array[str_long.charAt(j)]){count++;}

            // If all the characters are matched:
            if (count == len_short) {
                // Try to minimize the window. The idea is that the amount of
                // occurrences of the left most matched character of long string
                // must be equal to the amount of occurrences of the same character
                // of short string. If redundant occurrence, we exclude it  and
                // move window to the right.
                while (long_array[str_long.charAt(start)]
                        > short_array[str_long.charAt(start)]
                        || short_array[str_long.charAt(start)]
                        == 0) {

                    if (long_array[str_long.charAt(start)]
                            > short_array[str_long.charAt(start)])
                        long_array[str_long.charAt(start)]--;
                    start++;
                }

                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // ================================================================
        // If no window found, then:
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index and length min_len
        return str_long.substring(start_index, start_index + min_len);
        // ================================================================
    }

    // Execute the method:
    public static void main(String[] args) {
        String str_long = "This is a tstring to test if program works ok";
        System.out.println("\nThe long string: " + str_long);
        String str_short = "tist";
        System.out.println("The short string: " + str_short + "\n");

        System.out.print("The smallest window: " + findSubString(str_long, str_short));
    }
}