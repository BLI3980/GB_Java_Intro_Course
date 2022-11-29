// Task02: Create a program which checks whether one string is a reverse version of the other
import java.util.Scanner;

public class HW02_02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = iScanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = iScanner.nextLine();
        iScanner.close();

        if (str1.length() != str2.length())
            System.out.println("NO. String 1 and string 2 are not reverse of each other. ");
        else {
            int size = str1.length()-1;
            for (int i = 0; i < size; i++) {
                if (str1.charAt(i) != str2.charAt(size-i)){
                    System.out.println("NO. String 1 and string 2 are not reverse of each other. ");
                    break;
                }
            }
            System.out.println("YES. String 1 and string 2 are reverse of each other. ");
        }
    }
}
