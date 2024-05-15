package StringBuilderStringBuffer;

import java.util.Scanner;

public class pro2Duplicateremove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to remove Duplicate characters");
        String sb = sc.nextLine();
        sb = sb.replaceAll("\\s", "");
        String sb1 = "";

        for (int i = 0; i < sb.length() ; i++) {

           char ch = sb.charAt(i);
           String s3 = String.valueOf(ch);

           if(sb1.contains(s3))
           {
                continue;
           }
           else{
               sb1 = sb1.concat(s3);
            }


        }
        System.out.println(sb1);
        sc.close();
    }
}
