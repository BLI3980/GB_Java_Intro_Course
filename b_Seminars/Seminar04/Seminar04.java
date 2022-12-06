import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Seminar04 {

    public static void main(String[] args) {
        // ====================================================
        ArrayList<String> people = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Boolean> sex = new ArrayList<>();
        boolean finish = false;
        while(!finish) {
            people.add(EntryNames());
            ages.add(EntryAges());
            sex.add(EntrySex());
            String more = Ask_if_more();
            if (more.toUpperCase().equals("N")) {finish = true;}
        }
        // ====================================================
//        ArrayList<String> first = new ArrayList<>();
//        ArrayList<String> second = new ArrayList<>();
//        ArrayList<String> third = new ArrayList<>();
//        first.add("one one one");
//        second.add("two two two");
//        third.add("three three three");

//        people.add("Иванов Иван Иванович");
//        people.add("Петрова Полина Петровна");
//        people.add("Сидорова Сида Сидоровна");
//        ages.add(45);
//        ages.add(18);
//        ages.add(29);
////        ages.add(3);
////        ages.add(16);
////        ages.add(49);
////        ages.add(51);
//        sex.add(true);
//        sex.add(false);
//        sex.add(false);
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
        SortArrays(index_by, sname, fname, lname, ages, sex);

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

    public static void SortArrays(LinkedList indx,
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


}
