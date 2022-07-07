package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int result = linearSearch(new int[] {1,21,13,5,21},5 );
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
