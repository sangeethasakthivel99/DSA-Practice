package LinearSearch;

/* https://leetcode.com/problems/richest-customer-wealth/ */

public class RichestPerson {
    public static void main(String[] args) {
//        int[][] account =  {{1,2,3},{3,2,1}};
        int[][] account =  {{1,5},{7,3},{3,5}};
        int wealthyAmount = findWealthyAmount(account);
        System.out.println(wealthyAmount);
    }

    static int findWealthyAmount(int[][] arr) {
        int wealthyAmount = Integer.MIN_VALUE;

        for(int customer = 0; customer < arr.length; customer++) {
            int sum = 0;
            for(int bank = 0; bank< arr[customer].length; bank++) {
                sum = sum + arr[customer][bank];
            }
            if(wealthyAmount < sum) {
                wealthyAmount = sum;
            }
        }
        return wealthyAmount;
    }
}
