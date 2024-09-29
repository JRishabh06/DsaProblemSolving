//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

package LeetCodeProblems.java;
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {122,2,322,4,5234};
        System.out.println( numToStr(arr));

    }

    static int numToStr(int[] nums) {
        int count = 0;
        for (int element : nums) {
            String str = String.valueOf(element);
            int length = str.length();

            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    }

