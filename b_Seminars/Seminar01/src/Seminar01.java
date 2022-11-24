public class Seminar01 {
    static int x = 'f';
    public static final int Lesson1_a = 12;
    public int age = 42;



    public static void main(String[] args) {
        // ========================= Types of variables =====================
        int i = 1; // int 32 bit, long 64 bit, short 16 bit, byte 8 bit
        System.out.println(i);
        int j = 'g'; // 103 = '..' changes a letter to it's 16 bit index
        System.out.println(j);
        char ch = 'f';
        System.out.println(ch);
        float fl = 4.3f; // rational 32-bit number. Must end with 'f' symbol at the end
        double d = 4.65; // rational 64-bit number. Can put 'd' at the end, but
        // not necessary

        boolean [] bArray1;
        boolean[] bArray2;
        boolean bArray3 [];

        boolean[] bArray = new boolean[6]; // Cannot change the size of array in Java

        i = (int) 7.5; // will cut decimal part of a rational number
        System.out.println(i);

        // ========================= Loops =====================
        for (int k = 0; k < 10; k++) {
            //(1; 2; 3):
            // - 1 variable(s) as many as needed
            // - 2 condition to stop the loop
            // - 3 step
        }

        while (i < 46){
            i++;
        }

        // ========================= Condition =====================
        if (bArray[2]) {
            bArray[2] = false;
        }

        // ========================= Output =====================
        System.out.println("Example 1"); // Print with new line
        System.out.print("Example 2"); // Print without new line
        System.out.println();
        System.out.printf(""); // Formatted print

        // ========================= Strings =====================
        // Strings are NOT primitive type of variables. It's a class

        String strOne = "dfan";
        // " " - for strings; ' ' - for chars
        String strTwo = "anpqnvv";
        System.out.println("The index of letter a in " + strOne + " is " + strOne.compareTo("f"));
//        if (strOne.equals(strTwo)){} // Correct usage of comparison of strings
//
//        // if (strOne == strTwo){} - Incorrect usage of comparison of strings
//        String.valueOf(ch); // Converts any type of vars to string
//        strOne.split(""); // Splits a string into an array of string
//        strOne.charAt(5); // Returns a character in the string under index 5
//        strOne.contains("fnapd"); // Returns true/false, whether string contains substring

        System.out.println("Hello".repeat(5));

        // ========================= Reference Variables =====================
        Integer i2 = 4;
        int m = Integer.max(2, 5);
        int n = Integer.bitCount(56);
        System.out.println(n);
        Integer.bitCount(55);
        Integer.lowestOneBit(54);
        Integer.numberOfLeadingZeros(53);
    }

    public void newMethod(int age, double weight, String name){
        age = this.age;
        this.age = age;
        age = 16;
    }
}
