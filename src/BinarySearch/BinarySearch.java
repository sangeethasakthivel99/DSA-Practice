package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-12, -1, 2, 6, 9, 11, 234, 323, 1243};
        int[] arr = {12, 11, 9, 6, 2, 0, -1};
        System.out.println(descendingBinarySearch(arr, 2, 0, arr.length-1));
    }

    //Iteration Method
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid = (start+end)/2;
        for(start = 0; start <= end; start++) {
            if(arr[mid] == target) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

    //Recursion Method
    static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) /2;
        if(arr[mid] == target) {
            return mid;
        } else if(target < arr[mid]) {
            return recursiveBinarySearch(arr,target,start,mid-1);
        } else {
            return recursiveBinarySearch(arr,target,mid+1,end);
        }
    }

    //Descending Order binary search
    static int descendingBinarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) /2;
        if(arr[mid] == target) {
            return mid;
        } else if(target < arr[mid]) {
            return descendingBinarySearch(arr,target,mid+1,end);
        } else {
            return descendingBinarySearch(arr,target,start,mid-1);
        }
    }
}
