package LinearSearch;

public class SearchInRange {
    /* Input:-
           arr = [12,4,-2,23,54]
           search in the range in the array for the number -2 in index 0 to 3
     */
    public static void main(String[] args) {
        int result = linearSearch(new int[]{12,4,-2,23,54}, -2, -1,3);
        System.out.println(result);
    }

    static int linearSearch(int[] array, int target, int start, int end) {
        if(start >= 0 && end >= 0) {
            for(int i = start; i <= end; i++) {
                if(array[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
