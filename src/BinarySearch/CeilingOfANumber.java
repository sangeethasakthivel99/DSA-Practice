package BinarySearch;
/*
        Input:-
        arr = {1, 3, 5, 8, 12, 54, 79}
        target = 6   target = 11   target = 12
        Output:-
        8      12     12
     */
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12, 54, 79};
        int result = ceilingNumber(arr,2, 0, arr.length-1);
        System.out.println(result);
    }

    static int ceilingNumber(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                return arr[mid];
            } else if(target < arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
       return arr[start];
    }
}
