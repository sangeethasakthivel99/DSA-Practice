package LinearSearch;

public class LinearStringSearch {
    public static void main(String[] args) {
        int result = linearSearch("Hello", 'e');
        System.out.println(result);
    }

    static int linearSearch(String words, char target) {
        for (int i = 0; i< words.length(); i++) {
           if(words.charAt(i) == target) {
               return i;
           }
        }
        return -1;
    }
}
