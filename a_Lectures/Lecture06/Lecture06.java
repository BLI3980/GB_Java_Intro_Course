import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lecture06 {
    public static void main(String[] args) {
// =========================== Sets ==============================
//        Set<Integer> set = new HashSet<>();
//        set.add(1); set.add(12); set.add(123);
//        set.add(1234); set.add(1234);
//        System.out.println(set.contains(12)); // true
//        set.add(null);
//        System.out.println(set.size()); // 5
//        System.out.println(set); // [null, 1, 1234, 123, 12]
//        set.remove(12);
//        for (var item : set) System.out.print(item + " "); // null 1 1234 123
//        System.out.println();
//        set.clear();
//        System.out.println(set); // []
//
//        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
//        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
//        var u = new HashSet<Integer>(a); u.addAll(b);
//        var r = new HashSet<Integer>(a); r.retainAll(b);
//        var s = new HashSet<Integer>(a); s.removeAll(b);
//        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
//        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
//        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
//        System.out.println(r); // [2, 3, 5, 7]
//        System.out.println(s); // [1, 4, 6]

// =========================== OOP.Intro ==============================
        Employee e1 = new Employee();
        e1.firstName = "Name_1";
        e1.lastName = "Surname_1";
        e1.salary = 100;
        e1.id = 1000;

        Employee e4 = new Employee();
        e4.firstName = "Name_1";
        e4.lastName = "Surname_1";
        e4.salary = 100;
        e4.id = 1000;

        Employee e2 = new Employee();
        e2.firstName = "Name_2";
        e2.lastName = "Surname_2";
        e2.salary = 200;
        e2.id = 2000;

        Employee e3 = new Employee();
        e3.firstName = "Name_3";
        e3.lastName = "Surname_3";
        e3.salary = 300;
        e3.id = 3000;

        System.out.println(e1.toString());
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);


        System.out.println(e1 == e4);
        System.out.println(e1.equals(e4));
        var employees = new HashSet<Employee>(Arrays.asList(e1, e2, e3));
        System.out.println(employees.contains(e4));
        System.out.println(employees);

    }
}
