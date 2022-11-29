public class HW02_07 {
    public static void main(String[] args) {
        // Create a string of multiple symbols "="

        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("=");
        }
        str = sb.toString();
//        System.out.println("String before replacement: " + str);


        // Replace using StringBuilder method

        long start = System.currentTimeMillis();
        replaceBuilder(sb,"=", "equal ");
        String str1 = sb.toString();
        // Uncomment below line if you want to confirm replacement
//        System.out.println("Replacement by StringBuilder: " + str1);
        System.out.printf("It takes %d milliseconds to replace 10000 symbols " +
                "using StringBuilder method.\n", System.currentTimeMillis() - start);


        // Replace using String method

        start = System.currentTimeMillis();
        String str2 = replaceString(str, "=", "equal ");
        // Uncomment below line if you want to confirm replacement
//        System.out.println("Replacement by String: " + str2);
        System.out.printf("It takes %d milliseconds to replace 10000 symbols " +
                "using String method.\n", System.currentTimeMillis() - start);


    }

    public static void replaceBuilder(StringBuilder builder, String from, String to) {
        int index = builder.indexOf(from);
        while (index != -1) {
            builder.replace(index, index + from.length(), to);
            index += to.length();
            index = builder.indexOf(from, index);
        }
    }
    public static String replaceString(String str, String from, String to){
        String res = str.replaceAll(from, to);
        return res;
    }
}
