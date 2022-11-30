// Task03: Create a program to reverse a string using recursion.

public class HW02_03 {
    public static void main(String[] args) {
        String s = "adnfdfandf";
        System.out.println("Initial string: " + s);
        StringBuilder sb = new StringBuilder();
        s = revRec(s, sb,0);
        System.out.println("Reversed string: " + s);

    }
    static String revRec (String str, StringBuilder sb, int m) {
        if(m > str.length()-1) return "";

        revRec(str, sb,m+1);
        char i = str.charAt(m);
        sb.append(i);
        str = sb.toString();

        return str;
    }
}
