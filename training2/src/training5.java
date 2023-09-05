/*Given a m x n matrix grid which is sorted
in non-increasing order both row-wise and column-wise,
return the number of negative numbers in grid.
*/

public class training5 {
    public static void main(String[] args) {
        int[][] input = {
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        };
        System.out.println(countNegatives(input));

    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int v : row) {
                if (v < 0) {
                    count++;
                }
            }
        }
        return count;
    }

}