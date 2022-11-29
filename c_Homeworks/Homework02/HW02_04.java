// Task04: Two numbers are given (for instance, 3 and 56). Need to create the following
// strings : 3 + 56 = 59; 3 - 56 = -53; 3 * 56 = 168.
// StringBuilder.append() method to be used.

import java.util.Scanner;

public class HW02_04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = iScanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = iScanner.nextInt();
        iScanner.close();
        String sum = add(a, b);
        String deduct = sub(a, b);
        String product = mult(a, b);
        System.out.println(sum);
        System.out.println(deduct);
        System.out.println(product);
    }
    public static String add(int x, int y){
        String add;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(x).append(" + ").append(y).append(" = ").append(x+y);
        add = sb1.toString();
        return add;
    }
    public static String sub(int x, int y){
        String sub;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(x).append(" - ").append(y).append(" = ").append(x-y);
        sub = sb1.toString();
        return sub;
    }
    public static String mult(int x, int y){
        String mult;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(x).append(" * ").append(y).append(" = ").append(x*y);
        mult = sb1.toString();
        return mult;
    }

}
