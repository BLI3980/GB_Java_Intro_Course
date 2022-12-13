import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Seminar06 sem6 = new Seminar06();
    static String temp = "";

    public static void main(String[] args) {
//        sem6.methodAdd(4);
//        sem6.methodAdd(5);
//        sem6.methodAdd(4);
//        sem6.methodAdd(1);

        System.out.println(sem6.methodSize());

        Set<Integer> integers  = new HashSet<>();
//        integers.add(5);

// fill-up a set:
        System.out.println("Printing while randomly filling a set: ");
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            int n = new Random().nextInt(10);
            if (i > 0 && i < limit-1) {
                System.out.print(n + ", ");
            }  else if (i == 0){System.out.print("["+n+", ");}
            else {System.out.print(n+ "]");}
            sem6.methodAdd(n);
            integers.add(n);
        }
        System.out.println();
        // print filled up method set:
        System.out.println("Printing a set with methodRead: ");
        System.out.println(sem6.methodRead());
//        System.out.println(integers);

// print filled up integers set:
        System.out.println("Printing another set of integers: ");
        for (int i: integers) {
            System.out.print(i+ ", ");
        }
        System.out.println();



// Exactly the same as what is foreach (row 40) is based on
// but also can delete using Iterator
        Iterator<Integer> integerIterator = integers.iterator();
        while(integerIterator.hasNext()){
            int i = integerIterator.next();
//            integerIterator.remove();
        }

// Printing using Set built-in foreach
        System.out.println("Printing integers with built-in foreach: ");
        integers.forEach(n -> temp = temp + n);
        System.out.println(integers);
        System.out.println();

        Set<Integer> integers1 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            integers1.add(new Random().nextInt(10));
        }
        System.out.println("Printing integers1");
        System.out.println(integers1);


// retainAll removeAll
//        integers.retainAll(integers1);
//        System.out.println("Integers are removeAll: ");
//        System.out.println(integers);

// Stream
        List<Integer> stream = integers.stream().filter(integers1:: contains).collect(Collectors.toList());
        System.out.println(stream);


    }
}
