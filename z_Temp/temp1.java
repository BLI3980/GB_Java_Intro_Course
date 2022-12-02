import java.util.ArrayList;

public class temp1 {
    public static void main(String[] args) {


        // =====================================
        int [] arr1 = new int[100];
        String str = "abcd";
        arr1[str.charAt(0)] = 3;
        System.out.println(arr1[97]);
        // =====================================
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("one");
        str1.add("two!");
        str1.add("three");
        System.out.println(str1);
        for (int i = 0; i < str1.size(); i++) {
            if (str1.get(i) == "one") System.out.println(str1.get(i));
        }

    }
}
