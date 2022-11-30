// Task05: Replace symbol "=" by word "equal". Use methods
// StringBuilder.insert() and StringBuilder.deleteCharAt().
public class HW02_05 {

    public static void main(String[] args) {
        String add = HW02_04.add(3, 56);
        System.out.println("String before replacement: " + add);
        StringBuilder sb1 = new StringBuilder(add);
        sb1.insert(8,"equals").deleteCharAt(7);
        add = sb1.toString();
        System.out.println("String after replacement: " + add);
    }
}
