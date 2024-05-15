package StringBuilderStringBuffer;

import java.util.Arrays;
import java.util.Scanner;

public class pro3Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1 to check anagrams");
        String Str1 = sc.nextLine();
        System.out.println("Enter String2 to check anagrams");
        String Str2 = sc.nextLine();
        if(Str1.length() != Str2.length())
        {
            System.out.println("You are NOT entered valid String");
            System.exit(0);
        }
        if(Str1.equalsIgnoreCase(Str2))
        {
            System.out.println("You are entered Same String twice. Try Again");
            System.exit(0);
        }


       Str1 = Str1.replaceAll("//s", "");
        Str2 = Str2.replaceAll("//s", "");
        char[] arr1 = Str1.toLowerCase().toCharArray();
        char[] arr2 = Str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("its Anagram");
                    }
        else{
            System.out.println("Its Not an anagram");
        }

         sc.close();
    }
}
