// Task06: Replace symbol "=" by word "equal". Use method StringBuilder.replace()

public class HW02_06 {

    public static void main(String[] args) {
        String sub = HW02_04.sub(3, 56);
        System.out.println("String before replacement: " + sub);
        StringBuilder sb1 = new StringBuilder(sub);
        sb1.replace(7,8,"equals");
        sub = sb1.toString();
        System.out.println("String after replacement: " + sub);
    }
}
