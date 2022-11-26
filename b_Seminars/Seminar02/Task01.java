import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// Task: Create an array and then reverse it.
public class Task01 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];


        for (int i = 0; i < arr1.length; i++){
            if (i >= arr1.length){
                int[] temp = new int[arr1.length + arr1.length/2 + 1];
                // copy
                arr1 = temp;
            }
            arr1[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr1));

        int n = arr2.length;
        for (int i = 0; i < n; i++) {
            arr2[n-i-1] = arr1[i];
        }

        for (int i = 0; i < arr1.length/2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[n - i - 1];
            arr1[n - i - 1] = temp;
        }


//        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));

    }
}
