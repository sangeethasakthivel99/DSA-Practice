package LinearSearch;

public class MaximumValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 4, 24, 43, 53}, {345, 12, 32}};
        int max = findMax(arr);
        System.out.println(max);
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr.length; row++) {
            for(int col=0;col<arr[row].length; col++) {
                if(max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
