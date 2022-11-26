import java.io.File;
public class Lecture02 {
    public static void main(String[] args) {
        // ========================== String ==============================
        String[] name = {"B", "o", "r", "i", "s"};
        String bl = "Boris L.";
        System.out.println(bl.toLowerCase()); // boris l.
        System.out.println(String.join("", name)); // Boris
        System.out.println(String.join("", "B", "o", "r", "i", "s")); // Boris
        System.out.println(String.join(",", "B", "o", "r", "i", "s")); // B,o,r,i,s
        // StringBuilder - better for any editing of strings
        // String - better for any searches in strings

        // ========================== File System ==============================
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath()); // C:\_GB\5_Java\a_Lectures\Lecture02\file.txt


    }

}
