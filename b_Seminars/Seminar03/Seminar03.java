import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Seminar03 {
    public static void main(String[] args) {
        System.out.println("hello");
//        Seminar02[] arr = new Seminar02[]; // An array which stores elements of Seminar02

//        List arr1 = new ArrayList();
        ArrayList arr1 = new ArrayList();
        // List stores array of Objects
        arr1.add(1);
        arr1.add(1.5f);
        arr1.add("One");

        if (arr1.get(0) instanceof String) {}

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        // <> Defines the type of elements
        arr2.add(5);
        arr2.add(3);
        arr2.add(2,7);
        // If there was element under index 12 the program will shift all
        // further elements to the right
        arr2.set(2,0);
        // Replaces existing element under index 12
        // If there was no element under index 12 set will not create new element
        arr2.remove(2);
//        arr2.remove(new Integer(7));
        arr2.size(); // Shows the size of non-empty part of list
        arr2.ensureCapacity(100);
        // Ensures the list is less or equal 100
        arr2.clear();
        // Clears the list, arr.size becomes zero.
        // However, the actual size of array remains the same

        for (int i = 0; i < 10; i++) {
            arr2.add(new Random().nextInt(100));
        }

        for (int i = 0; i < arr2.size(); i++) {
            arr2.remove(i);
        }

        for (Integer i: arr2) {
            i = new Random().nextInt(100);
            System.out.println(i);
        }

        Iterator<Integer> iter = arr2.iterator();
        while (iter.hasNext()){
            int i = iter.next();
            i = 7;
            System.out.println(i);
        }

        ListIterator<Integer> iter1 = arr2.listIterator(args.length/2);
        while (iter1.hasPrevious()){
            int i = iter1.previous();
        }

        arr2.forEach(i -> System.out.println(i));



    }
}
