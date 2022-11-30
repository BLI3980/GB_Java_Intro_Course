public class temp1 {
    // Java program to find the smallest window in a long string containing all
    // characters of a smaller string.

    // NOTE: !!! The first 256 characters of Unicode are considered to be potentially
    // present in strings. Therefore, code won't work with non latin alphabet !!!
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
        // Count occurrences of each character of short string
        // and store them as elements of short_array under indices
        // corresponding to characters numbers in Unicode
        for (int i = 0; i < len_short; i++) {
//            System.out.println("pat.charAt = " + pat.charAt(i));
            short_array[str_short.charAt(i)]++;
//            System.out.println("patArray[] = " + patArray[pat.charAt(i)]);
//            System.out.println();
        }
        // ================================================================
        System.out.println("\nPattern array: ");
        for (int i = 0; i < short_array.length; i++) {
            if (short_array[i] != 0) {
                System.out.printf("value: %d, index: %d; ", short_array[i], i);

            }
        }
        System.out.println("\n");
        // ================================================================

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        // ================================================================
        // Go through the long string:
        // Count occurrences of characters in the long string.
        int count = 0;
        for (int j = 0; j < len_long; j++) {
//            System.out.print("str.charAt = " + str.charAt(j)+ "; ");
            long_array[str_long.charAt(j)]++;
//            System.out.println(str.charAt(j));
//            System.out.printf("strArray[%c] = %d; \n",str.charAt(j) , strArray[str.charAt(j)]);
//            System.out.printf("");
            // If  long string's char matches with short string's char then
            // increment count
            if (long_array[str_long.charAt(j)]
                    <= short_array[str_long.charAt(j)]){
                count++;
//                System.out.printf("str %d, pat %d \n", strArray[str.charAt(j)],
//                        patArray[str.charAt(j)]);
            }
            // If all the characters are matched:
            if (count == len_short) {
//                System.out.println(str.charAt(start));
//                System.out.println(strArray[str.charAt(start)]);
                // Try to minimize the window. The idea is that the amount of
                // occurrences of the left most matched character of long string
                // must be equal to the amount of occurrences of the same character
                // of short string. If redundant occurrence, we exclude it move window
                // to the right.
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
//                    System.out.printf("min_len = %d, start_index = %d, " +
//                            "start = %d", min_len, start_index, start);
//                    System.out.println();
//                    System.out.println();
                }
            }
        }

        // ================================================================
        System.out.println("String array: ");
        for (int i = 0; i < long_array.length; i++) {
            if (long_array[i] != 0) {
                System.out.printf("value: %d, index: %d; ", long_array[i], i);

            }
        }
        System.out.println("\n");
        // ================================================================

        // If no window found, then:
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index and length min_len
        return str_long.substring(start_index, start_index + min_len);
    }

    // Driver Method
    public static void main(String[] args) {
        String str_long = "This is a test string";
        System.out.println("The long string: " + str_long);
        String str_short = "tist";
        System.out.println("The short string: " + str_short);

        System.out.print("The smallest window: " + findSubString(str_long, str_short));
    }
}
