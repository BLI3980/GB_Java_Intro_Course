import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Seminar06 {
    private Map<Integer, Object> new_set = new HashMap<>();
    private static final Object ZEROVALUE = new Object();

    public void methodAdd(int x) {
        new_set.put(x, ZEROVALUE);
    }

    public int methodSize() {return new_set.size();}

    public String methodRead(){return new_set.keySet().toString();}

//    public static Map Set() {
//        Map<Integer, String> set = new HashMap<>();
//        Scanner set_entries = new Scanner(System.in);
//        boolean enough = false;
//        while (!enough){
//            System.out.println("Enter an integer value to include in a set: ");
//            int set_next = set_entries.nextInt();
//            set.put(set_next,"");
//            if (Ask_if_enough()) {
//                enough = true;
//            }
//
//        }
//        return set;
//    }
//
//    public static Set Set_show(Map map) {return map.keySet();}
//
//    public static boolean Ask_if_enough() {
//        Scanner ask = new Scanner(System.in);
//        System.out.println("Do you want make another entry (Y/N)?: ");
//        String answer = ask.nextLine();
//        if (answer.toLowerCase().startsWith("n")){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
}
