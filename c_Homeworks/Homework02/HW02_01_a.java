// Task01:

import java.util.Arrays;

public class HW02_01_a {

    public static void main(String[] args) {
        String str = "this is a test string";
        System.out.println("The test string: " + str);
        String pat = "tist";
        System.out.println("The pattern string: " + pat);

        FindWindow(str, pat);

    }

    public static void FindWindow(String str, String pat) {
        int count = 0;
        int[] str_positions = new int[pat.length()];
        int loop_start = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < pat.length(); i++) {        // The loop for pat
            for (int j = loop_start; j < str.length(); j++) {    // The loop for str
                System.out.printf("i = %d; j = %d; count = %d\n", i, j, count);
                if (count == 1){
//                    start = j;
//                    System.out.println("start = " + j);
                }
                if (pat.charAt(i) == str.charAt(j)){
                    str_positions[count] = j+1;
                    System.out.println("string position = " + str_positions[count]);
                    count++;
                    loop_start++;
                    System.out.println("count = " + count);
                    System.out.printf("symbol = %c; its position in test string = %d\n"
                            , str.charAt(j), j);
                    if (count == pat.length()){
                        end = j;
                        System.out.println("count = " + count);
                        System.out.println("pat length = " + pat.length());
//                        System.out.println("end = " + j);
                        System.out.println(str_positions[str_positions.length-1]);
                        System.out.printf("window = %d",str_positions[str_positions.length-1]
                                -str_positions[0]);
                    }
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(str_positions));


    }
}
