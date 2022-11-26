import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Seminar02 {
    public static void main(String[] args) {
        // ======================== Arrays ============================
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = new int[15];
        int[][] arr4 = new int[16][2];

        for (int i = 0; i < arr3.length; i++){
            if (i >= arr3.length){
                int[] temp = new int[arr3.length + arr3.length/2 + 1];
                // copy
                arr3 = temp;
            }
            arr3[i] = new Random().nextInt(100);
        }

        for (int i = 0; i < arr4.length; i++) {
            arr4[i][0] = new Random().nextInt(100);
            arr4[i][1] = new Random().nextInt(100);

        }
        Arrays.sort(arr3, 0, arr3.length/2);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr4, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(arr4));

        // ======================== Strings ============================
        String s = "Privet!" + "adf"; // Immutable object
        StringBuilder stringBuilder = new StringBuilder(s); // Almost like an array
        // Builder is much better than String for editing, adding, deleting string objects
        System.out.println(stringBuilder);
        stringBuilder.append("napf"); // Builder has a lot of methods
        s = stringBuilder.toString(); // Assigning back to string "s"
        System.out.println(s);

        // ======================== Strings ============================
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += Character.toString(i);
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(Character.toString(i));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}