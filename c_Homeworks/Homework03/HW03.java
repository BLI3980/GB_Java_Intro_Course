// Task01: Create new list, add a few elements and print the collection to the console
// Task02: Iterate through each element of the list and add "!" symbol to each element.
// Task03: Insert element into the 1st position of the list.
// Task04: Extract element at specified index of the list.
// Task05: Update/replace certain element of the list by index.
// Task06: Delete the third element of the list.
// Task07: Find an element of the list by string value.
// Task08: Create new list add several element of the first list into new list.
// Task09: Delete from the first list all elements that are not present in the 2nd list.
// Task10: Sort a list
// Task11: Compare execution times for 1000 iterations of task03 for ArrayList and LinkedList.

import java.util.*;

public class HW03 {
    public static ArrayList HW03_Task01(){
        ArrayList<String> new_list = new ArrayList<>();
        new_list.add("black");
        new_list.add("white");
        new_list.add("red");
        new_list.add("blue");
        new_list.add("green");

        return new_list;
    }
    public static ArrayList HW03_Task02(ArrayList<String> str) {
        ArrayList<String > str1 = new ArrayList<>();
        for (String i: str) {i += "!"; str1.add(i);}
        return str1;
    }

    public static void main(String[] args) {
        // ================ Task01 ==========================
        ArrayList<String> list1 = HW03_Task01();
        System.out.println("Task 01: " + list1);

        // ================ Task02 ==========================
        list1 = HW03_Task02(list1);
        System.out.println("Task 02: " + list1);

        // ================ Task03 ==========================
        list1.add(0, "brown");
        System.out.println("Task 03: " + list1);

        // ================ Task04 ==========================
        System.out.println("Task 04: " + list1.get(2));

        // ================ Task05 ==========================
        list1.set(1, "orange");
        System.out.println("Task 05: " + list1);

        // ================ Task06 ==========================
        list1.remove(2);
        System.out.println("Task 06: " + list1);

        // ================ Task07 ==========================
        System.out.print("Task 07: ");
        for (String i : list1) {
            if (i == "brown") System.out.println(i);
        }
        // ================ Task08 ==========================
        List list2 = list1.subList(1,3);
        System.out.println("Task 08: " + list2);

        // ================ Task019 ==========================
        list1.retainAll(list2);
        System.out.println("Task 09: " + list1);

        // ================ Task010 ==========================
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(new Random().nextInt(100));
        }
        System.out.println("Task 10 before: " + list3);
        list3.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1 - o2;
           }
        });
        System.out.println("Task 10 after: " + list3);

        // ================ Task11 ==========================
        System.out.println("Task 11: ");
        ArrayList<Integer> list5 = new ArrayList<>();
        LinkedList<Integer> list6 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list5.add(0, new Random().nextInt(100));
        }
        long time_count = System.currentTimeMillis() - start;
        System.out.printf("Time taken for ArrayList is %d milliseconds.\n", time_count);
//        System.out.println(list5);
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list6.add(0, new Random().nextInt(100));
        }
        time_count = System.currentTimeMillis() - start;
        System.out.printf("Time taken for LinkedList is %d milliseconds.\n", time_count);

//        System.out.println(list6);

    }
}
