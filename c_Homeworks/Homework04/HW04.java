
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HW04 {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        // First users date entry. From console.
        // Comment framed lines if you want to use another, quick
        // data entry further down
        // ====================================================
        boolean finish = false;
        while(!finish) {
            people.add(EntryNames());
            ages.add(EntryAges());
            gender.add(EntrySex());
            String more = Ask_if_more();
            if (more.toUpperCase().equals("N")) {finish = true;}
        }
        // ====================================================
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();

        // Another user data entries, just to save time during code testing
        // ====================================================
//        first.add("one one one");
//        second.add("two two two");
//        third.add("three three three");
//
//        people.add("Иванов Иван Иванович");
//        people.add("Петрова Полина Петровна");
//        people.add("Сидорова Сида Сидоровна");
//        ages.add(45);
//        ages.add(18);
//        ages.add(29);
//        gender.add(true);
//        gender.add(false);
//        gender.add(false);
        // ====================================================

        LinkedList<Integer> index_by = new LinkedList<>();
        index_by = SortIndex(ages);

        ArrayList<String> fname = new ArrayList<>();
        ArrayList<String> sname = new ArrayList<>();
        ArrayList<String> lname = new ArrayList<>();

        for (String i: people) {
            String[] sur_fir_last = i.split(" ");
            if(sur_fir_last.length == 3){
                sname.add(sur_fir_last[0]);
                fname.add(sur_fir_last[1]);
                lname.add(sur_fir_last[2]);
            } else if (sur_fir_last.length == 2){
                sname.add(sur_fir_last[0]);
                fname.add(sur_fir_last[1]);
                lname.add("");
            } else{
                sname.add(sur_fir_last[0]);
                fname.add("");
                lname.add("");
            }
        }

        // Original lists
        System.out.println("Original lists: ");
        System.out.println(sname);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(ages);
        System.out.println(gender);
        System.out.println();

        // Sorted printing of users by age
        System.out.println("Sorting printing of users by age: ");
        SortedPrinting(index_by, sname, fname, lname, ages, gender);

        // New sorted lists
        Object sname_sorted = SortArrays(index_by, sname);
        Object fname_sorted = SortArrays(index_by, fname);
        Object lname_sorted = SortArrays(index_by, lname);
        Object age_sorted = SortArrays(index_by, ages);
        Object gender_sorted = SortArrays(index_by, gender);

        System.out.println("New sorted lists: ");
        System.out.println(sname_sorted);
        System.out.println(fname_sorted);
        System.out.println(lname_sorted);
        System.out.println(age_sorted);
        System.out.println(gender_sorted);

    }

    public static String EntryNames(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter person's surname, name and last name " +
                "separated by space: ");
        String person = entry.nextLine();
        return person;
    }

    public static int EntryAges(){
        Scanner entry = new Scanner(System.in);
        System.out.print("Enter the age of this person: ");
        int age = entry.nextInt();
        return age;
    }

    public static boolean EntrySex(){
        Scanner entry = new Scanner(System.in);
        System.out.print("Enter the sex of this person (Male or Female): ");
        String sex = entry.nextLine();
        if(sex.toLowerCase().startsWith("m")){
            return true;
        } else{
            return false;
        }
    }

    public static String Ask_if_more(){
        Scanner ask = new Scanner(System.in);
        System.out.println("Do you want to enter another person's details " +
                "(Y or N)?");
        String answer = ask.nextLine();
        return answer;
    }

    public static LinkedList SortIndex(ArrayList sort_by){
        LinkedList<Integer> indx = new LinkedList<>();
        for (int i = 0; i < sort_by.size(); i++) {
            indx.add(i);
        }
        int list_size = sort_by.size()-1;
        for (int i = 0; i < list_size; i++) {
            int min_value = (int) sort_by.get(indx.get(i));
            int min_indx = i;
            for (int j = i+1; j <= list_size; j++) {
                if((int) sort_by.get(indx.get(j)) < min_value){
                    min_value = (int) sort_by.get(indx.get(j));
                    min_indx = j;
                }
            }
            int temp = indx.get(i);
            indx.set(i,indx.get(min_indx));
            indx.set(min_indx, temp);
        }
        return indx;
    }

    public static void SortedPrinting(LinkedList indx,
                                  ArrayList sname, ArrayList fname,
                                  ArrayList lname, ArrayList age,
                                  ArrayList gender){
        for (Object i: indx) {
            System.out.print("ФИО: " + sname.get((int)i) + " " +
                    fname.get((int) i) + " " + lname.get((int) i) +
                    ", возраст: " + age.get((int) i) + " лет, " +
                    "мужчина?: " + gender.get((int) i) + "\n");
        }
        System.out.println();
    }

    public static Object SortArrays(LinkedList index, ArrayList array){
        List new_array = new ArrayList();
        for (Object i: index) {
            new_array.add(array.get((int)i));
        }
        return new_array;
    }


}