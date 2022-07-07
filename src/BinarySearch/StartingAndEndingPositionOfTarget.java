package BinarySearch;

import java.util.Arrays;

/*
    Input :
    arr = {2,3,4,4,4,3,3,8,8,9}
    target = 8
    output = [7,8]
 */
public class StartingAndEndingPositionOfTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 4, 4, 8, 8, 9};
//        int[] result = findPosition(arr,8);
//        System.out.println(Arrays.toString(result));
        int firstIndex = findIndex(arr, 4, true);
        int lastIndex = findIndex(arr, 4, false);
        System.out.println(firstIndex + " " + lastIndex);
    }

    //BruteForce
    static int[] findPosition(int[] arr, int target) {
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIndex = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIndex = i;
                break;
            }
        }
        return new int[]{firstIndex, lastIndex};
    }

    //Optimal Solution
    static int findFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                end = end - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findLastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                start = start + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findIndex(int[] arr, int target, boolean isFirstIndex) {
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}

