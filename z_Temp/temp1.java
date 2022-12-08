import javax.sound.sampled.Line;
import java.io.StringReader;
import java.util.*;

public class temp1 {
    public static void main(String[] args) {

//
//        // =====================================
//        int [] arr1 = new int[100];
//        String str = "abcd";
//        arr1[str.charAt(0)] = 3;
//        System.out.println(arr1[97]);
//        // =====================================
//        ArrayList<String> str1 = new ArrayList<>();
//        str1.add("one");
//        str1.add("two!");
//        str1.add("three");
//        System.out.println(str1);
//        for (int i = 0; i < str1.size(); i++) {
//            if (str1.get(i) == "one") System.out.println(str1.get(i));
//        }
        // =====================================
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a letter: ");
//        String letter = scan.next();
//        String letterN = "N";
//        if (letter == letterN){
//            System.out.println("Letter N was entered.");
//        }else{
//            System.out.println("Not letter N was entered.");
//        }



// ==================================================================
//        ArrayList<Integer> list_age = new ArrayList<>();
//        LinkedList<Integer> list_indx = new LinkedList<>();
//        list_age.add(45);
//        list_age.add(23);
//        list_age.add(99);
//        list_age.add(16);
//        list_age.add(38);
//        System.out.println(list_age);
//        list_indx.add(0);
//        list_indx.add(1);
//        list_indx.add(2);
//        list_indx.add(3);
//        list_indx.add(4);
//        System.out.println(list_indx);

// ==================================================================
//        int cnt = list_age.size() - 1;
//        while(cnt > -1){
//            int max_age = list_age.get(list_indx.get(cnt));
//            System.out.println("cnt = " + cnt);
//            System.out.println("list_indx.get() = " + list_indx.get(cnt));
//            System.out.println("list_age.get() = " + list_age.get(list_indx.get(cnt)));
//            System.out.println();
//
//            int index = cnt;
//            for (int i = 0; i < cnt; i++) {
//                System.out.println("max_age= " + max_age);
//                System.out.println("list_index.get() = " + list_indx.get(i));
//                System.out.println("list_age.get()= " + list_age.get(list_indx.get(i)));
//                System.out.println();
//                if(max_age < list_age.get(list_indx.get(i))){
//                    max_age = list_age.get(list_indx.get(i));
//                    index = i;
//                    System.out.println("max_age = " + max_age + "; max_age index = " + index);
//                    System.out.println();
//                }
//            }
//            int tmp = list_indx.get(cnt);
//            list_indx.set(cnt, list_indx.get(index));
//            list_indx.set(index, tmp);
//            System.out.println("list_index = " + list_indx);
//            System.out.println();
//            cnt--;
//        }
//        System.out.println(list_indx);
// ==================================================================
//        int list_size = list_indx.size()-1;
//        for (int i = 0; i < list_size; i++) {
//            int min_value = (int) list_age.get(list_indx.get(i));
//            int min_ind = i;
//            for (int j = i+1; j <= list_size; j++) {
//                if((int) list_age.get(list_indx.get(j)) < min_value){
//                    min_value = (int) list_age.get(list_indx.get(j));
//                    min_ind = j;
//                }
//            }
//            int temp = list_indx.get(i);
//            list_indx.set(i,list_indx.get(min_ind));
//            list_indx.set(min_ind, temp);
//        }
//        System.out.println(list_indx);
// ==================================================================
        Integer[] date = {4, 3, 2, 1, 0};
        List<Integer> index_list = Arrays.asList(date);
        List<Integer> index_list1 = Arrays.asList(date);

        System.out.println(index_list);
        Map<Integer, String> colors = new HashMap<>();
        colors.put(3, "teal");
        colors.put(1, "olive");
        colors.put(0, "magenta");
        colors.put(4, "beige");
        colors.put(2, "plum");
        Set<Integer> keys = colors.keySet();
        int[] key_arr = new int[colors.size()-1];
//        System.out.println(keys);
        keys.toArray();
//        Arrays.sort(keys,keys.size(),0);

//        for (int i: colors.keySet()) {
//            key_arr[]
//        }
//        colors.forEach((k,v) -> index_list1.add(k));
//        for (int i: colors.keySet()) {
//            index_list1.add(i);
//        }
//        System.out.println(index_list1);

        System.out.println(colors.entrySet());


        for (int i: index_list) {
            System.out.println(colors.get(i));
        }
    }
    static void Print(String str){
        System.out.println(str);
    }
}
