import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class Seminar05 {
    public static void main(String[] args) {
//1. ==================== HashMap ===============================
        Map<Integer, String> mp = new HashMap<>();
        Set<Integer> keySet = mp.keySet();
        mp.put(5, "Five");
        mp.put(3, "Three");
        System.out.println("1. " + mp.get(5));
        System.out.println("2. " + keySet);
        String str = mp.get(32);
        if(mp.get(32) != null){System.out.println("3. " + str);}
        mp.getOrDefault(32, "def");
        System.out.println("4. " + mp.containsKey(5));
        System.out.println("5. " + mp.containsValue("Five"));
        System.out.println("6. " + mp.entrySet());
        Set<Map.Entry<Integer, String >> aSet = mp.entrySet();
        mp.remove(4);
        mp.replace(5, "five!");
        System.out.println("7. " + mp);
        mp.replace(5, "five!", "five!!");
        System.out.println("8. " + mp);
        mp.size();
        mp.forEach((k, v) -> System.out.println("key: " + k + "; value: " + v));
        mp.compute(5, (k, v) -> v = v+"!!");
        System.out.println("9. " + mp);
        mp.computeIfAbsent(6, k -> CompIfAbs());
        System.out.println("10. " + mp);
        mp.computeIfPresent(6, (k, v) -> CompIfPr(v));
        System.out.println("11. " + mp);
        mp.putIfAbsent(7, "Seven"); // Same as put, but checks if absent or not
        System.out.println("12. " + mp);
        mp.merge(7, "SV_", (k, v) -> v = v+"!");
        System.out.println(mp);

        for (int i: keySet) {
            mp.compute(i, (k, v) -> v=v+": "+i+"!");
        }
        System.out.println(mp);
//2. ==================== LinkedHashMap ===========================
        Map<Integer, String> mp2 = new LinkedHashMap<>();
        // The difference from HashMap is that LinkedHashMap saves the sequence of
        // entry of elements.
        Map<Integer, String> mp3 = new TreeMap<>();
        // The fastest way to find to an element of a Map in order to read it
        // But each way we add an element to TreeMap, the tree is reorganized



    }
    static String CompIfAbs(){return "...";}
    static String CompIfPr(String v){return v+"!";}
}

