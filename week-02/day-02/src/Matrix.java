public class Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {
       int[][] multiD = new int[4][4];

       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               if (i == j) {
                   multiD[i][j] = 1;
               } else multiD[i][j] = 0;
               System.out.print(multiD[i][j]); //here we have all the values in one line
           }
           System.out.println();  /*with this print, that has to be AFTER the first for, but
                                    BEFORE the second, we break the line after the fourth element */
       }



    }
}
