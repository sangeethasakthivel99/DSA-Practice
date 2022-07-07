package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4, 24, 43, 53}, {345, 12, 32}};
        int[] result = linearSearch(arr, 24);
        System.out.println(Arrays.toString(result));
    }

    static int[] linearSearch(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
