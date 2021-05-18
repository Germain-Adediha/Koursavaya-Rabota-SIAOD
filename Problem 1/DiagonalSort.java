import java.util.*;
public class DiagonalSort{

    public static  int[][] diagonalSort(int[][] M) {
        int y = M.length, x = M[0].length - 1;
        int[] diag = new int[y];
        for (int i = 2 - y; i < x; i++) {
            int k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    diag[k++] = M[j][i+j];
            Arrays.sort(diag, 0, k);
            k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    M[j][i+j] = diag[k++];
        }
        return M;
    }

    public static void printMassive(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)
            // converting each row as string and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }


    public static void main(String[] args) {
        int massive [][] = { { 5, 3, 1 ,4},
						{ 2, 2, 1 ,0},
						{ 1, 1, 1 ,1} };
      // System.out.println(Arrays.toString(mat));
     printMassive(massive);
     System.out.println();
     diagonalSort(massive);
     printMassive(massive);
    }
}