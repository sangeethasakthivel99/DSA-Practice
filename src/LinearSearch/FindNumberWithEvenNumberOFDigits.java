package LinearSearch;

public class FindNumberWithEvenNumberOFDigits {
    /*
        Input:-
        number = [12,345,2,6,7896]
        Output:-
        2
        Here only 12 and 7896 have even Number of digits
     */
    public static void main(String[] args) {
        int[] arr = {-12, 345, 2, 6, -8926};
        int result = find(arr);
        System.out.println(result);
    }

    static int find(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isEvenOptimal(num)) {
                count++;
            }
        }
        return count;
    }

    //OneWay
    static boolean isEvenByConvertingToString(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return String.valueOf(num).length() % 2 == 0;
    }

    //second way
    static boolean isEven(int num) {
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return false;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }

    //Optimal way

    static boolean isEvenOptimal(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int noOfDigits = (int) (Math.log10(num) + 1);
        return noOfDigits % 2 == 0;
    }

}
