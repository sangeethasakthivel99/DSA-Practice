package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12, 54, 79};
        int result = floorOfANumber(arr, 68);
        System.out.println(result);
    }

    static int floorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
