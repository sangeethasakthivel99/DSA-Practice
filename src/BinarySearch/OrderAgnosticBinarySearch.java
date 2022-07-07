package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 11, 9, 6, 2, 0, -1};
//        int[] arr = {-1, 0, 2, 6, 9, 11, 12};
        int result = agnosticSearch(arr, 0, 0, arr.length - 1);
        System.out.println(result);
    }

    static int agnosticSearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (isAscending(arr)) {
            if (target < arr[mid]) {
                return agnosticSearch(arr, target, start, mid-1);
            } else {
                return agnosticSearch(arr, target, mid+1, end);
            }
        } else {
            if (target < arr[mid]) {
                return agnosticSearch(arr, target, mid + 1, end);
            } else {
                return agnosticSearch(arr, target, start, mid - 1);
            }
        }
    }

    static boolean isAscending(int[] arr) {
        return arr[0]<arr[arr.length-1];
    }
}
