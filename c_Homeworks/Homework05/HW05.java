import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class HW05 {
    public static void main(String[] args) {
        // Create a HashMap<Integer, String>:
        Map<Integer, String> colors = new HashMap<>();

        // Fill with three keys/values. Values are colors:
        colors.put(1,"maroon");
        colors.put(23, "teal");
        colors.put(95,"beige");

        // Add key if no such key is present in HashMap:
        colors.putIfAbsent(67,"emerald");
        System.out.println(colors);

        // Change values by adding "!" to each value:
        for (int i: colors.keySet()) {
            colors.compute(i, (k, v) -> v = v+"!");
        }
        System.out.println(colors);

        // Do the same as all above to new TreeMap:
        Map<Integer, String> colors1 = new TreeMap<>();
        colors1.put(15, "olive");
        colors1.put(77, "violet");
        colors1.put(22, "plum");
        colors1.putIfAbsent(17, "black");
        System.out.println(colors1);
        for (int i: colors1.keySet()) {
            colors1.compute(i, (k, v) -> AddExclamation(v));
        }
        System.out.println(colors1);


        long countdown_start = System.currentTimeMillis();
        //Filling HashMap with specified amount of random elements
        AddElements(colors, 1000);
        long countdown_end = System.currentTimeMillis();
        long time_taken = countdown_end - countdown_start;
        System.out.println("Time taken to fill-up the HashMap: " +
                time_taken + " milliseconds");
//        System.out.println(colors);

        countdown_start = System.currentTimeMillis();
        //Filling TreeMap with specified amount of random elements
        AddElements(colors1, 1000);
        countdown_end = System.currentTimeMillis();
        time_taken = countdown_end - countdown_start;
        System.out.println("Time taken to fill-up the TreeMap: " +
                time_taken + " milliseconds");
//        System.out.println(colors1);


        countdown_start = System.currentTimeMillis();
        // Randonbly call for elements in HashMap specified amount of times
        RandomCall(colors,1000);
        countdown_end = System.currentTimeMillis();
        time_taken = countdown_end - countdown_start;
        System.out.println("Time taken to call for 1000 elements of the HashMap: "
                + time_taken + " milliseconds");

        countdown_start = System.currentTimeMillis();
        // Randonbly call for elements in TreeMap specified amount of times
        RandomCall(colors1,1000);
        countdown_end = System.currentTimeMillis();
        time_taken = countdown_end - countdown_start;
        System.out.println("Time taken to call for 1000 elements of the TreeMap: "
                + time_taken + " milliseconds");


    }
    static String AddExclamation(String v){return v+"!";}
    static Map AddElements(Map map, int how_many_elements){
        int range = how_many_elements;
        int count = 0;
        while (count < range) {
            count = 0;
            int key = new Random().nextInt(1, range+1);
            String element = "element-"+key;
            map.putIfAbsent(key, element);
            for (Object i: map.keySet()) {
                count++;
            }
        }
//        System.out.println(count);
        return map;
    }

    static void RandomCall(Map map, int how_many_times){
        int range = how_many_times;
        int count = 0;
        while (count < range) {
            int key = new Random().nextInt(1, range+1);
            map.compute(key, (k, v) -> v = v+"!");
            count++;
        }
    }


}
