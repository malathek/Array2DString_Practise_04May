package Array2D;

public class pro3Transpose2DArray {
    public static void main(String[] args) {
        int[][] array2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] trans_Array = new int[3][3];

        for(int i = 0; i < array2D.length; i++) {
            for(int j=0; j < array2D[i].length; j++ )
            {
                 trans_Array[j][i]=array2D[i][j];
            }

        }
        System.out.println("{");
        for(int k = 0; k < trans_Array.length; k++) {
            for(int l=0; l < trans_Array[k].length; l++ )
            {
                if(l==0){
                    System.out.print("{");
                }

                System.out.print(trans_Array[k][l]);
                System.out.print(" ");

                if(l == trans_Array[k].length -1 && k!=2) {
                    System.out.print("},");
                }
                else if(l == trans_Array[k].length -1 && k==2){
                    System.out.print("}");
                }
            }
            System.out.println();

        }
        System.out.println("}");


    }
}
