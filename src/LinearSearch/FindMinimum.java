package LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        findMin(new int[]{12,32,0,13,434,-2, -19, 34});
    }

    static void findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
