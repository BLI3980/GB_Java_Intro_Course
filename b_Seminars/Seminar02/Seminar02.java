import java.util.Random;

public class Seminar02 {
    public static void main(String[] args) {
        String a = "Hello";
//        System.out.println(a);

        int i = new Random().nextInt(-1000, 1001);
        System.out.println("i = " + i);
        if (i < 0) i = -i;
        System.out.println("i = " + i);

        int n = Math.abs(Integer.highestOneBit(i));
//        int n = Integer.highestOneBit(i);
//        int n_mod = Math.abs(n);
//        int m = -2147483648;
//        int abs_m = Math.abs(m);
        System.out.println("n = " + n);
//        System.out.println("abs_m = " + abs_m);
        int until = Short.MAX_VALUE;
        System.out.println("until = " + Math.floor(until/2));
        int size = 0;
        int [] m1 = new int [size];
        int count = 0;
        for (int j = i; j < Math.floor(until/2); j++) {
            if(j % n == 0){
                count++;
//                System.out.println(count);
//                System.out.println("hello");
            }
        }
        System.out.println(count);
        System.out.println("bitcount = " + Integer.bitCount(128));

        String z = Integer.toBinaryString(-12);
        System.out.println(z);
    }

}
