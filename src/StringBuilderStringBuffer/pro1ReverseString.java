package StringBuilderStringBuffer;

public class pro1ReverseString {
    public static void main(String[] args) {
        String name = "machine";
        String rev_name = "";

        for (int i = name.length()-1; i>=0; i--) {

            rev_name = String.valueOf(name.charAt(i));
            System.out.print(rev_name);
        }

    }
}
