// Task: Reverse a string using StringBuilder
public class Task02 {
    public static void main(String[] args) {
        // Attempt 1
        String s = "Hello World!";
        System.out.println("Initial word: " + s);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println("Reversed word: " + s);

        // Attempt 2
        String s_1 = "Bla Bla Bla";
        sb = new StringBuilder(s_1);
        System.out.println("Initial word: " + s_1);
        s_1 = sb.reverse().toString();
        System.out.println("Reversed word: " + s_1);

    }

}
