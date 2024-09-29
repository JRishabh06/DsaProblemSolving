//1672. Richest Customer Wealth

package LeetCodeProblems.java;

public class Problem2 {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3},
                           {1, 2, 3}};

        System.out.println(maximumWealth(accounts));

    }
      static int maximumWealth(int[][] accounts) {


        int max = 0;

        for(int row = 0 ; row < accounts.length ; row++) {
            int sum = 0;

            for (int col = 0; col < accounts[row].length; col++) {


                sum += accounts[row][col];

            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }
}

