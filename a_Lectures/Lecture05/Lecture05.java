// Lecture structure:
// 01. Map overview and functionality
// 02. What for
// 03. HashMap
// 04. TreeMap
// 05. LinkedHashMap
// 06. Examples

import java.util.HashMap;
import java.util.Map;

public class Lecture05 {
    public static void main(String[] args) {
//1. ====================== HashMap ===========================
            Map<Integer, String> db = new HashMap<>();
            db.put(1, "один"); System.out.println(db);
            db.put(2, "два"); System.out.println(db);
            db.put(3, "три"); System.out.println(db);
            db.put(31, "три один"); System.out.println(db);
            db.put(13, "один три"); System.out.println(db);
            db.put(null, "!null"); System.out.println(db);
            db.put(null, null); System.out.println(db);
    }

}

