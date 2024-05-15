package Array2D;

public class pro1MaximumValue {
    public static void main(String[] args) {
        int[][] array2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < array2D.length; i++) {
            for(int j=0; j < array2D[i].length; j++ )
            {
                if(maxValue < array2D[i][j])
                {
                    maxValue = array2D[i][j];
                }
            }

        }

        System.out.println("Maximum value in array is "+ maxValue);
    }
}
