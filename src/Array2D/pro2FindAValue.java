package Array2D;

import java.util.Scanner;

public class pro2FindAValue {
    public static void main(String[] args) {
        int[][] array2D = {
                {1,-2,3},
                {4,5,-6},
                {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number which you want to search in 2D array");
        int findVal = sc.nextInt();
        boolean result = false;

        for(int i = 0; i < array2D.length; i++) {
            for(int j=0; j < array2D[i].length; j++ )
            {
                if(findVal == array2D[i][j])
                {
                    result = true;
                }
            }

        }

        System.out.println(result);
    }
}
