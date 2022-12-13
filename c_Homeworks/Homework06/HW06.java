import java.util.*;

public class HW06 {
    public static void main(String[] args) {
        Comparator<Integer> int_comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Map<Integer,Object> new_set = new TreeMap<>(int_comp);
        add_element(new_set, 6);
        add_element(new_set, 9);
        add_element(new_set, 12);
        add_element(new_set, 6);
        System.out.println(new_set.keySet());

    }
    public static void add_element(Map map,int x){
        map.put(x,"");
    }
}
