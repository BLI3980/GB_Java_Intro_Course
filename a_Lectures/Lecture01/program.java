import java.io.ObjectOutputStream.PutField;
import java.security.PublicKey;
import java.util.Scanner;

import javax.annotation.processing.Filer;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class program {
    public static void main(String[] args) {
        // =============================== Basics =========================

        // System.out.println("Hello World");

        // short age = 10;
        // int salary = 123456;
        // System.out.println(age); // 10
        // System.out.println(salary); // 123456

        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415

        // System.out.println(flag3); // true
        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234;
        // System.out.println(flag2); // false
        // boolean flag3 = flag1 ^ flag2;

        // =============================== Vars =========================
        //
        // String msg = "Hello World";
        // System.out.println(msg); // Hello World
        //
        var i = 123;
        System.out.println(getType(i)); // Integer
        var j = 123.456;
        System.out.println(getType(j)); // Double
        //
        // =============================== Vars =========================

        // int n = 123;
        // System.out.println(Integer.MAX_VALUE); // Integer is wrapper class. Same for
        // others - Boolean, Double, etc
        // System.out.println(Integer.MIN_VALUE);

        // int m = 123_456;
        // System.out.println(m); // 123456

        // String a = "qwerty";
        // char b = a.charAt(1);
        // System.out.println(b);

        // int c = 123;

        // // System.out.println(c++); // 123 - incremented but increment priority is
        // lower
        // // than printing
        // // System.out.println(c); // 124
        // // System.out.println(++c); // 125 - increment priority is higher than
        // printing
        // System.out.println(c);

        // c = c-- - --c;
        // System.out.println(c);
        // c = --c - c--;
        // System.out.println(c);

        // int d = 18; // 10010
        // System.out.println(d >> 1); // 10010 -> 1001

        // int g = 5;
        // int h = 2;
        // System.out.println(g | h); // 111
        // // 101
        // // 010
        // // 111

        // System.out.println(g & h); // 000
        // // 101
        // // 010
        // // 000

        // System.out.println(g ^ h); // 111
        // // 101
        // // 010
        // // 111

        // boolean k = true;
        // boolean l = true;
        // System.out.println(k & l); // true
        // // 1
        // // 1
        // // 1
        // System.out.println(k && l); // true

        // String o = "aww1"; // 4, 0...3
        // // boolean p = o.length() >= 5 && o.charAt(4) == '1'; // false
        // boolean p = o.length() >= 5 & o.charAt(4) == '1'; // Out of index range
        // exception
        // System.out.println(p);

        // =============================== Arrays ==============================

        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5

        // int brr[] = new int[3];
        // System.out.println(brr.length);

        // int[] arr1[] = new int[3][5]; // 2D array
        // int[][] arr2 = new int[3][5]; // Jagged array - array of arrays

        // for (int[] line : arr1) {
        // for (int item : line) {
        // System.out.printf("%d", item);
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr2[i].length; j++) {
        // System.out.printf("%d", arr2[i][j]);
        // }
        // System.out.println();
        // }

        // =============================== Type Casting ==============================
        //
        // int i = 123;
        // double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415;
        // i = (int) d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415;
        // i = (int) d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("230");
        // System.out.println(b); // NumberFormatException: Value out of range.
        // byte can only store values up to 128
        //
        // =============================== Input ==============================

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Hello, %s!", name);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // // returns true is input has only integers
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // =============================== Formatted Output =========================

        // // int a = 1, b = 2;
        // // int c = a + b;
        // // String res = a + " + " + b + " = " + c;
        // // System.out.println(res);
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.println(res);
        // System.out.printf("%d + %d = %d \n", a, b, c);

        // // %d - for integers
        // // %x - for 16-system numbers
        // // %f - for floats
        // // %e = for numbers in exponential form, for instance, 3.1415e+01
        // // %c - for single symbol
        // // %s - for string values

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3.141500
        // System.out.printf("%.2f\n", pi); // 3.14
        // System.out.printf("%.3f\n", pi); // 3.141
        // System.out.printf("%e\n", pi); // 3.141500e+00
        // System.out.printf("%.2e\n", pi); // 3.14e+00
        // System.out.printf("%.3e\n", pi); // 3.141e+00

        // =============================== Visibility =========================

        // int b = 111;
        // {
        // int a = 222;
        // System.out.println(a);
        // System.out.println(a + b);
        // }
        // int a = 123;
        // System.out.println(a);
        // System.out.println(a + b);

        // =============================== Methods =========================
        // sayHi();
        // utility.sayHello();
        // util1.sayWhatsup();
        // lib.sayHello();

        // =============================== Conditions ======================
        // int a = 1;
        // int b = 2;
        // int c;

        // // if (a > b) {
        // // c = a;
        // // } else {
        // // c = b;
        // // }

        // // if (a > b)
        // // c = a;
        // // if (b > a)
        // // c = b;

        // System.out.println(c);

        // int a = 1;
        // int b = 2;

        // int min = a < b ? a : b; // if a < b then "?" return a, else ":" return b
        // System.out.println(min);

        // ===============================
        // int month = 1;
        // String text = "";
        // switch (month) {
        // case 1:
        // text = "November";
        // break;
        // case 2:
        // text = "December";
        // break;
        // // ....
        // default:
        // text = "mistake";
        // break;

        // }
        // System.out.println(text);

        // =============================== Loops ======================
        // int value = 321;
        // int count = 0;

        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);

        // do {
        // value /= 10;
        // count++;
        // System.out.println(value);
        // } while (value != 0);
        // System.out.println(count);

        // for (int i = 0; i < 10; i++) {
        // if (i % 2 == 0)
        // continue;
        // System.out.println(i);

        // }

        // for (int i = 0; i < 10; i++) {
        // if (i % 2 != 0)
        // break;
        // System.out.println(i);

        // }

        // int arr[] = new int[] { 1, 2, 3, 4, 5, 77 };
        // for (int i : arr) {
        // System.out.printf("%d", i);
        // }
        // System.out.println();

        // =============================== Files ======================
        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        // fw.write("line 1");
        // fw.append('\n');
        // fw.append('2');
        // fw.append('\n');
        // fw.write("line 3");
        // fw.flush();
        // fw.close();
        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());
        // }

        // public static void main(String[] args) throws Exception {
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        // char ch = (char) c;
        // if (ch == '\n') {
        // System.out.print(ch);
        // } else {
        // System.out.print(ch);
        // }
        // }

        // public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        // System.out.printf("== %s ==\n", str);
        // }
        // br.close();
        // }

    }

    static void sayHi() {
        System.out.println("Hi!");
    }

     static String getType(Object o) {
     return o.getClass().getSimpleName();
     }
}
