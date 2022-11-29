import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lecture03 {
    public static void main(String[] args) {
        // =================== Objects ===========================
        Object o = 1;
        GetType(0);   // java.lang.Integer
        o = 1.2;
        GetType(o);            // java.lang.Double
        // Integer and integer - case exists in Sum method
        // hence returns correct result
        System.out.println(Sum(1, 2));
        // Double and integer - case does not exit in Sum method
        // hence returns 0
        System.out.println(Sum(1.0, 2));
        // Integer and double - case does not exit in Sum method
        // hence returns 0
        System.out.println(Sum(1, 2.0));
        // Double and double - case exists in Sum method
        // hence returns correct result
        System.out.println(Sum(1.2, 2.1));

        // =================== Arrays ===========================
        int[] a = new int[]{1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);

        System.out.print("Initial array a: ");
        for (int i: a) {System.out.printf("%d ", i);} // 1 9
        System.out.println();
        System.out.print("Increased array b: ");
        for (int j: b) {System.out.printf("%d ", j);} // 1 9 0
        System.out.println();

        a = AddItem(a, 2);
        a = AddItem(a, 3);
        System.out.print("Increased array a: ");
        for (int i: a) {System.out.printf("%d ", i);} // 1 9
        System.out.println();

        // =================== Collection ========================
        // List - ArrayList, LinkedList (Vector, Stack -legacy)
        // ------------------- ArrayList -------------------------
//        List lst = new List(); // Can call for main list hierarchy
//        ArrayList<Integer> lst = new ArrayList<Integer>(); // Generalized type list
//        List lst = new List(); // Raw type list
        ArrayList lst = new ArrayList();

        lst.add(2809);
        lst.add("1234");

        for (Object o1: lst){
            System.out.println(o1);
        }

        // Ways to initialize array lists:
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Integer> lst3 = new ArrayList<>(10);
        ArrayList<Integer> lst4 = new ArrayList<>(lst3);

        // ------------------- ArrayList Functionalities ----------
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = {day, month, year};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        StringBuilder day1 = new StringBuilder("28");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        StringBuilder[] date1 = new StringBuilder[]{day1, month1, year1};
        List<StringBuilder> d1 = Arrays.asList(date1);
        System.out.println(d1); // [28, 9, 1990]
        date1[1] = new StringBuilder("09");
        System.out.println(d1); // [28, 09, 1990]

        List<Character> lst_ch1 = List.of('B', 'o', 'r', 'i', 's');
        System.out.println(lst_ch1);
        List<Character> lst_ch = new ArrayList<Character>();
        lst_ch.add('B');
        lst_ch.add('o');
        lst_ch.add('r');
        lst_ch.add('i');
        lst_ch.add('s');
        lst_ch.add('D');
        System.out.println(lst_ch);
        lst_ch.remove(5);
//        lst_ch1.remove(1); // java.lang.UnsupportedOperationException
        System.out.println(lst_ch);

        // ------------------- Iterator -------------------------
        List<Integer> lst5 = List.of(1, 12, 123, 1234, 12345);

        for (int item: lst5) {
            System.out.println(item);
        }
        Iterator<Integer> col = lst5.iterator();
        System.out.println();

        while (col.hasNext()){
            System.out.println(col.next());
        }

    }


    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }

    static Object Sum (Object a, Object b){
        if (a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }

    static int[] AddItem(int[] array, int item){
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

}
