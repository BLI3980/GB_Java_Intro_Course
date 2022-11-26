
import java.util.Arrays;
import java.util.Random;

public class HW01 {
    public static void main(String[] args) {
        int i = randInt();
        int m = msbNum(i);
        int[] m1 = n_multiples(m, i);
        briefPrintArray(m1);
        int[] m2 = n_non_multiples(m, i);
        briefPrintArray(m2);

        // Uncomment below three lines in order to print the entire m1 and m2 arrays
//        System.out.println(Arrays.toString(m1));
//        System.out.println();
//        System.out.println(Arrays.toString(m2));

    }

    // 1. Get a random integer number in a range from -1000 to 1000.
    public static int randInt() {
        int i = new Random().nextInt(-1000, 1001);
        System.out.println("1. A random integer in a range from -1000 to 1000 is i = " + i + "\n");
        return i;
    }

    // 2. Find MSB number and save it to a variable n.
    public static int msbNum(int i) {
        if (i < 0) {
            i = -i;
            System.out.println("  The number of MSB can be found only for unsigned number." +
                    "Therefore we will use i = " + i);
        }
        int n = Integer.toBinaryString(i).length();
        System.out.printf("2. The MSB number for %d is n = %d\n\n", i, n);
        return n;
    }

    /* 3. Find all multiples of n in the range from i to Short.MAX_VALUE and
    save them to m1 array.*/
    public static int[] n_multiples(int n, int i) {
        int smv = Short.MAX_VALUE;
        System.out.println("3. The maximum value for an integer of type Short is: " + smv);
        int count = 0;
        // Any number divides without remainder by one and by itself
        int [] m1 = new int [2];

        // Filling m1 array with multiples of n.
        for (int j = i; j <= smv; j++) {
            if(j % n == 0){
                m1[count] = j;
                count++;
            }
            // Increasing m1 array size by one.
            if (count >= m1.length){
                int[] temp = new int[count+1];
                for (int k = 0; k < m1.length; k++) {
                    temp[k] = m1[k];
                }
                m1 = temp;
            }
        }
        // Removing last zero element of the m1 array
        if (m1[m1.length-1] == 0){
            int[] temp = new int[m1.length-1];
            for (int m = 0; m < m1.length-1; m++) {
                temp[m] = m1[m];
            }
            m1 = temp;
        }

        System.out.printf("The amount of multiples of %d in the range from %d to %d is %d. ", n, i, smv, count-1);
        System.out.println("We have written them into m1 array.");
        return m1;
    }

    /* 4. Find all numbers that are NOT multiples of n in the range from
    Short.MIN_VALUE to i and save them to m2 array.*/
    public static int[] n_non_multiples(int n, int i) {
        int smv = Short.MIN_VALUE;
        System.out.println("4. The minimum value for an integer of type Short is: " + smv);
        int count = 0;
        // Any number divides without remainder by one and by itself
        int [] m2 = new int [2];

        // Filling m2 array with multiples of n.
        for (int j = smv; j <= i; j++) {
            if(j % n != 0){
                m2[count] = j;
                count++;
            }
            // Increasing m2 array size by one.
            if (count >= m2.length){
                int[] temp = new int[count+1];
                for (int k = 0; k < m2.length; k++) {
                    temp[k] = m2[k];
                }
                m2 = temp;
            }
        }
        // Removing last zero element of the m2 array
        if (m2[m2.length-1] == 0){
            int[] temp = new int[m2.length-1];
            for (int m = 0; m < m2.length-1; m++) {
                temp[m] = m2[m];
            }
            m2 = temp;
        }

        System.out.printf("The amount of numbers in the range from %d to %d, that are " +
                "not multiples of %d, is %d. ", smv, i, n, count-1);
        System.out.println("We have written them into m2 array.");

        return m2;
    }

    // Print several m1 elements at the beginning and the end of array just to
    // show if all correct:
    public static void briefPrintArray(int[] arr) {
        System.out.println("Here are the first 10 and the last 10 elements of the array. " +
                "Just as an example of values of elements of the array: ");
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j <= 9) System.out.print(arr[j] + ", ");
            if (j == 10) System.out.print(" ...");
            if (j >= arr.length-10) System.out.print(", " + arr[j]);
        }
        System.out.println("]\n");
    }

}

