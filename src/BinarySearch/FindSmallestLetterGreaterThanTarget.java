package BinarySearch;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j' };
        char result = findGreaterThanTarget(letters, 'j');
        System.out.println(result);
    }

    static char findGreaterThanTarget(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                start++;
            }
        }
//        if(start == arr.length) return arr[0];
//        return arr[start];

//        optimal
        return arr[start % arr.length];
    }
}
