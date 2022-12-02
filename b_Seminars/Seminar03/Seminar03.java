import java.util.*;

public class Seminar03 {
    public static void main(String[] args) {
//1. Array can store any elements, even elements from other files
        // An array which stores elements of Seminar02
//        Seminar02[] arr = new Seminar02[5];

//2. List
        List list0 = new ArrayList(); // Can call a list as List
        ArrayList list1 = new ArrayList(); // Or can call it as ArrayList to be more specific
        // List is array of Objects
        list1.add(1);
        list1.add(1.5f);
        list1.add("One");

//3. ArrayList
        // If need to pull elements out of a list with various types, have to do the following:
        if (list1.get(0) instanceof String) {}
        // Not recommended to store elements of various types. Better to store one type and
        // specify the type of elements in brilliants (<> brackets):
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(3);
        System.out.println(list2);

//4. Add into specific place,i.e. insert
        list2.add(0,7); // First parameter specifies the index for adding el.
        // If there was element under index 12 the program will shift all further
        // elements to the right. Works only for existing indexes of the list
        // It basically works as insert
        System.out.println(list2);

//        list2.add(12, 34); // This won't work in recent versions of Java!
//        System.out.println(list2); // java.lang.IndexOutOfBoundsException

//5. Get an element at certain index from the list
        int temp = list2.get(1); // To get an element we want from the list
        System.out.println(list2.get(1));

//6. Set a certain value to certain index in the list
        list2.set(2,0);
        // Replaces existing element under index 2
        // If there was no element under index 2 set will not create new element
        System.out.println(list2);

//7. Remove an element at certain index and of certain value from the list
        list2.remove(2);
        list2.remove(new Integer(7)); // Removes value 7 from the list
        System.out.println(list2);

//8. Check the size of the list - non-empty part of the list
        list2.size(); // Shows the size of non-empty part of list
        System.out.println("list size = " + list2.size());

//9. Ensure that capacity of the list is of what we need
        list2.ensureCapacity(100);
        // Ensures the list is less or equal 100
        // If list has more than 100, nothing happens; If less - it will reduce capacity

//10. Clear the list
        list2.clear();
        // Clears the list, arr.size becomes zero.
        // However, the actual capacity of array remains the same

//11. FOR Loop
        // For Loop. Here creating a list of random integers in the range of 0 to 100
        for (int i = 0; i < 10; i++) {
            list2.add(new Random().nextInt(10));
        }

//12. FOREACH Loop
        // Foreach Loop
        for (Integer i: list2) {
//            i = new Random().nextInt(100); // If want to replace elements of the list
            System.out.print(i + " ");
        }
        System.out.println();
//        System.out.println(list2);
        System.out.println("list size = " + list2.size());

//13. Remove using FOR loop
        // If we want to remove elements from the list
        // Note, as elements shift to the left on the place of the index of deleted
        // element and i shift to the right by one we end up deleting every second
        // element of the list
        for (int i = 0; i < list2.size(); i++) {
            list2.remove(i);
        }
        System.out.println("list2 = " + list2);
//        System.out.println("list size = " + list2.size());

//13. Iterator
        // The only case when Iterator would be used instead of Foreach is
        // when you need to delete using method .remove()
//        Iterator<Integer> iter = list2.iterator();
//        while (iter.hasNext()){
//            int i = iter.next();
////            i = 7;
////            System.out.print(i + " ");
//            if (i <50) iter.remove();
//        }
//        System.out.println(list2);

//14. ListIterator - only for list, not for all collections
//        ListIterator<Integer> iter1 = list2.listIterator(args.length/2);
//        // Unlike Iterator, LisiIterator can traverse not only to next, but
//        // also to previous element of the list
//        // Also in paramenters can be an index of the start of the work we want to do
//        while (iter1.hasPrevious()){
//            int i = iter1.previous();
//        }
//15. Built-in FOREACH for list collection
//        //Work for a single action with a list
//        list2.forEach(i -> System.out.print(i + " "));
//        System.out.println();

//16. .removeAll() and .retainAll()
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list3.add(new Random().nextInt(10));
        }
        System.out.println("list3 = " + list3);
        System.out.println();

//        list2.removeAll(list3);
//        // In this case removes all values from list2 which are
//        // present in list3

//        list2.retainAll(list3);
//        // In this case retains all values from list2 which are
//        // present in list3
//
//        System.out.println("list2 = " + list2);
//        System.out.println("list3 = " + list3);

//17. Sort list with Comparator
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


//        list2.forEach(i -> System.out.println(i));
        System.out.println("list2 = " + list2);

//18. Sublist
        List l2 = list2.subList(2, list2.size()-2); // returns slice of original list

//19. Other
        list2.trimToSize(); // trims the list to the size, i.e. if list has
        // capacity of 20, but list size is 15, it will trim to 15
        list2.indexOf(7); // Returns an index of the first occurrence of value 7

//20. Collections - helper Class
        System.out.println(Collections.nCopies(6, new String("Hello")));

    }


}
